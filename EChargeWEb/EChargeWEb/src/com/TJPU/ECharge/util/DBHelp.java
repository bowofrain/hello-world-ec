package com.TJPU.ECharge.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBHelp {
	private Connection conn;
	private Statement state;
	private PreparedStatement prep;
	public DBHelp() {
		try {
			Context context=new InitialContext();
			DataSource source=(DataSource) context.lookup("java:comp/env/jdbc/echargeconn");
			this.conn=source.getConnection();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//增删改
	public int update(String sql) throws SQLException{
		state=conn.createStatement();
		
		int temp=state.executeUpdate(sql);
		return temp;
		
	}
	public int update(String sql,Object...arr) throws SQLException{
		prep=conn.prepareStatement(sql);
		for(int i=0;i<arr.length;i++){
			prep.setObject(i+1, arr[i]);
		}
		return prep.executeUpdate();
	}
//查
 	public ResultSet select(String sql) throws SQLException{
		state=conn.createStatement();
		ResultSet rs=state.executeQuery(sql);
		return rs;
	}
 	public ResultSet select(String sql,Object ... arr) throws SQLException{
		prep=conn.prepareStatement(sql);
		for(int i=0;i<arr.length;i++){
			prep.setObject(i+1, arr[i]);
		}
		return prep.executeQuery();
	}
//关闭
	public void closeAll() throws SQLException{
		if(state!=null && !state.isClosed()) state.close();
		if(prep!=null && !prep.isClosed()) prep.close();
		if(conn!=null && !conn.isClosed()) conn.close();
	
	}
}
