package com.TJPU.ECharge.vo;

public class Page {
	private int curPage;//µ±Ç°Ò³
	private int showNumber;//ÏÔÊ¾µÄÒ³Êý
	private int count;//×ÜÌõÄ¿Êý
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getShowNumber() {
		return showNumber;
	}
	public void setShowNumber(int showNumber) {
		this.showNumber = showNumber;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Page(int curPage, int showNumber, int count) {
		super();
		this.curPage = curPage;
		this.showNumber = showNumber;
		this.count = count;
	}
	//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ò³ï¿½ï¿½
	public int getTotalNumber() {
		return (this.count-1)/this.showNumber+1;
	}
	//ï¿½ï¿½Ñ¯ï¿½ï¿½Ê¼Î»ï¿½ï¿½
	public int getSelectIndex() {
		return (this.curPage-1)*this.showNumber;
	}
	//ï¿½ï¿½Ò»Ò³
	public int getPrePage() {
		int temp=this.curPage-1;
		if(temp<1){
			temp=1;
		}
		return temp;
	}
	//ï¿½ï¿½Ò»Ò³
	public int getNextPage() {
		int temp=this.curPage+1;
		if(temp>this.getTotalNumber()){
			temp=this.getTotalNumber();
		}
		return temp;
	}
}
