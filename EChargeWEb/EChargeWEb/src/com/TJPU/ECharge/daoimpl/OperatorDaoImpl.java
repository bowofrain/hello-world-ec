package com.TJPU.ECharge.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.TJPU.ECharge.dao.OperatorDao;
import com.TJPU.ECharge.exception.PasswordNotCorrectException;
import com.TJPU.ECharge.exception.UserNotFoundException;
import com.TJPU.ECharge.util.DBHelp;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Operator;

public class OperatorDaoImpl implements OperatorDao {

	private DBHelp DB;
	
	public OperatorDaoImpl() {
		DB=new DBHelp();
	}
	
	
	@Override
	public T_Operator Login(String username, String password) {
		// TODO Auto-generated method stub
		T_Operator operator = new T_Operator();
		String sql = "select * from t_operator where O_ID =?";
		ResultSet rs;
		try {
			rs = DB.select(sql, username);

			if (!rs.next()) {
				throw new UserNotFoundException("用户不存在:" + username);
			} else {
				if (!password.equals(rs.getString("O_Password"))) {
					throw new PasswordNotCorrectException("密码不正确哦!");
				}
				operator.setO_ID(rs.getString("O_ID"));
				operator.setO_Password(rs.getString("O_Password"));
				operator.setO_Name(rs.getString("O_Name"));
				operator.setO_IDCard(rs.getString("O_IDCard"));
				operator.setO_Department(rs.getString("O_Department"));
				operator.setO_Adress(rs.getString("O_Adress"));
				operator.setO_Tel(rs.getString("O_Tel"));
				operator.setO_Memo(rs.getString("O_Memo"));
				operator.setR_ID(rs.getString("R_ID"));
				operator.setA_ID(rs.getString("A_ID"));
				operator.setO_Time(rs.getTimestamp("O_Time"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return operator;
	}


	@Override
	public int AddOperator(T_Operator tOperator) {
		// TODO Auto-generated method stub
		String sql="insert into t_operator(t_operator.O_ID,t_operator.O_Password,t_operator.O_Name,t_operator.O_IDCard,t_operator.O_Department,t_operator.O_Adress,t_operator.O_Tel,t_operator.R_ID,t_operator.A_ID,t_operator.O_Time) values (?,?,?,?,?,?,?,?,?,?)";
		int temp=-1;
		try {
			temp=DB.update(sql, tOperator.getO_ID(),tOperator.getO_Password(),tOperator.getO_Name(),tOperator.getO_IDCard(),tOperator.getO_Department(),tOperator.getO_Adress(),tOperator.getO_Tel(),tOperator.getR_ID(),tOperator.getA_ID(),new Timestamp(tOperator.getO_Time().getTime()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}


	@Override
	public List<T_Operator> AllOperator(Page page) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM t_operator limit ?,?";
		List<T_Operator> OperaterList=new ArrayList<T_Operator>();
		try {
			ResultSet rs=DB.select(sql,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				OperaterList.add(
						new T_Operator(
								rs.getString("O_ID"),
								rs.getString("O_Password"),
								rs.getString("O_Name"),
								rs.getString("O_IDCard"),
								rs.getString("O_Department"),
								rs.getString("O_Adress"),
								rs.getString("O_Tel"),
								rs.getString("R_ID"),
								rs.getString("A_ID"),
								rs.getTimestamp("O_Time")
						));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return OperaterList;
	}


	@Override
	public int OperatorCount() {
		// TODO Auto-generated method stub
		String sql="SELECT COUNT(*) FROM t_operator";
		int temp=0;
		try {
			ResultSet rs=DB.select(sql);
			if(rs.next()){
				temp=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}


	@Override
	public T_Operator OperatorInfo(String OID) {
		// TODO Auto-generated method stub
		T_Operator tOperator = new T_Operator();
		String sql = "select * from t_operator where O_ID =?";
		ResultSet rs;
		try {
			rs = DB.select(sql, OID);
			if(rs.next()){
				tOperator.setO_ID(rs.getString("O_ID"));
				tOperator.setO_Password(rs.getString("O_Password"));
				tOperator.setO_Name(rs.getString("O_Name"));
				tOperator.setO_IDCard(rs.getString("O_IDCard"));
				tOperator.setO_Department(rs.getString("O_Department"));
				tOperator.setO_Adress(rs.getString("O_Adress"));
				tOperator.setO_Tel(rs.getString("O_Tel"));
				tOperator.setO_Memo(rs.getString("O_Memo"));
				tOperator.setR_ID(rs.getString("R_ID"));
				tOperator.setA_ID(rs.getString("A_ID"));
				tOperator.setO_Time(rs.getTimestamp("O_Time"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tOperator;
	}


	@Override
	public int UpdateOperator(T_Operator tOperator) {
		// TODO Auto-generated method stub
		String sql="update t_operator set t_operator.O_Name=?,t_operator.O_IDCard=?,t_operator.O_Department=?,t_operator.O_Adress=?,t_operator.O_Tel=?,t_operator.R_ID=?,t_operator.A_ID=? where t_operator.O_ID=?";
		int temp=-1;
		try {
			temp=DB.update(sql,tOperator.getO_Name(),tOperator.getO_IDCard(),tOperator.getO_Department(),tOperator.getO_Adress(),tOperator.getO_Tel(),tOperator.getR_ID(),tOperator.getA_ID(),tOperator.getO_ID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}


	@Override
	public int DeleteOperator(String OId) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM t_operator WHERE t_operator.O_ID=?";
		int temp=-1;
		try {
			temp=DB.update(sql,OId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	
	
	
	
	
	
	
	
	
}
