package com.tutorials.general;

public final class MyNoMutableClass {

	private int uid;
	private String name;
	private String lname;
	
	public MyNoMutableClass(){
		super();
		this.uid = 0;
		this.name = null;
		this.lname = null;
	}
	public MyNoMutableClass(int uid, String name, String lname) {
		super();
		this.uid = uid;
		this.name = name;
		this.lname = lname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "MyNoMutableClass [uid=" + uid + ", name=" + name + ", lname="
				+ lname + "]";
	}
	
	
	
}
