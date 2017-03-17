package com.oaec.dvd.model;

public class User {
	private int id;
	private String uname;
	private String upass;
	private int type;
	public User(String uname, String upass, int type) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.type = type;
	}
	public User(int id, String uname, String upass, int type) {
		this.id = id;
		this.uname = uname;
		this.upass = upass;
		this.type = type;
	}
	public User(){
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getUname() {
		return uname;
	}
	void setUname(String uname) {
		this.uname = uname;
	}
	String getUpass() {
		return upass;
	}
	void setUpass(String upass) {
		this.upass = upass;
	}
	int getType() {
		return type;
	}
	void setType(int type) {
		this.type = type;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result=true;
		if(obj==null||obj.getClass()!=Object.class){
			result=false;
		}
		User u=(User)obj;
		if(u.getId()==this.getId()){
			result=false;
		}
		else{
			result=true;
		}
		return result;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", upass=" + upass + ", type=" + type + "]";
	}
	
	
}
