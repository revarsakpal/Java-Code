package com.demo.beans;

import java.util.Date;

public abstract class Student {
	private int sid;
	private String sname;
	private String address;
	public static int id=0;
	public Student() {
		this.sid=++id;
		this.sname=null;
		this.address=null;
	}
	public Student(String name,String address) {
		this.sid=++id;
		this.sname=name;
		this.address=address;
	}
	/*private String generateID(int id) {
		
		return "SPU"+"/"+new Date().getYear()+"/"+this.id;
	}*/

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	abstract public float calculatePer();
	
	public String toString() {
		String str="";
		str+="ID: "+this.sid+" Student Name : "+ this.sname + " Address:  "+ this.address;
	    return str;
	}

}
