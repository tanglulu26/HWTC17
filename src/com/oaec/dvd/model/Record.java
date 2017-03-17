package com.oaec.dvd.model;

public class Record {
	private int id;
	private int uid;
	private int did;
	private String lendTime;
	private String returnTimt;
	public Record(int uid, int did, String lendTime, String returnTimt) {
		super();
		this.uid = uid;
		this.did = did;
		this.lendTime = lendTime;
		this.returnTimt = returnTimt;
	}
	public Record(int id, int uid, int did, String lendTime, String returnTimt) {
		super();
		this.id = id;
		this.uid = uid;
		this.did = did;
		this.lendTime = lendTime;
		this.returnTimt = returnTimt;
	}
	public Record(){
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	int getUid() {
		return uid;
	}
	void setUid(int uid) {
		this.uid = uid;
	}
	int getDid() {
		return did;
	}
	void setDid(int did) {
		this.did = did;
	}
	String getLendTime() {
		return lendTime;
	}
	void setLendTime(String lendTime) {
		this.lendTime = lendTime;
	}
	String getReturnTimt() {
		return returnTimt;
	}
	void setReturnTimt(String returnTimt) {
		this.returnTimt = returnTimt;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result=true;
		if(obj==null||obj.getClass()!=Object.class){
			result=false;
		}
		Record r=(Record)obj;
		if(r.getId()==this.getId()){
			result=false;
		}
		else{
			result=true;
		}
		return result;
	}
	
	
}
