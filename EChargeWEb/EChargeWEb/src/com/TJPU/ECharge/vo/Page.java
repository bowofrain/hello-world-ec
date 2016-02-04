package com.TJPU.ECharge.vo;

public class Page {
	private int curPage;//��ǰҳ
	private int showNumber;//��ʾ��ҳ��
	private int count;//����Ŀ��
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
	//������ҳ��
	public int getTotalNumber() {
		return (this.count-1)/this.showNumber+1;
	}
	//��ѯ��ʼλ��
	public int getSelectIndex() {
		return (this.curPage-1)*this.showNumber;
	}
	//��һҳ
	public int getPrePage() {
		int temp=this.curPage-1;
		if(temp<1){
			temp=1;
		}
		return temp;
	}
	//��һҳ
	public int getNextPage() {
		int temp=this.curPage+1;
		if(temp>this.getTotalNumber()){
			temp=this.getTotalNumber();
		}
		return temp;
	}
}
