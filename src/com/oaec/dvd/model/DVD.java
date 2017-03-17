package com.oaec.dvd.model;
public class DVD {
	private int id;
	private String dname;
	private int dcount;
	private int status;
	public DVD(String dname, int dcount, int status) {
		this.dname = dname;
		this.dcount = dcount;
		this.status = status;
	}
	public DVD(int id, String dname, int dcount, int status) {
		this.id = id;
		this.dname = dname;
		this.dcount = dcount;
		this.status = status;
	}
	public DVD(){
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getDname() {
		return dname;
	}
	void setDname(String dname) {
		this.dname = dname;
	}
	int getDcount() {
		return dcount;
	}
	void setDcount(int dcount) {
		this.dcount = dcount;
	}
	int getStatus() {
		return status;
	}
	void setStatus(int status) {
		this.status = status;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result=true;
		if(obj==null||obj.getClass()!=Object.class){
			result=false;
		}
		DVD d=(DVD)obj;
		if(d.getId()==this.getId()){
			result= false;
		}
		else{
			result= true;
		}
		return result;
	}
	@Override
	public String toString() {
		return "DVD [id=" + id + ", dname=" + dname + ", dcount=" + dcount + ", status=" + status + "]";
	}
	
	
}
