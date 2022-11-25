package com.demo.beans;

import java.util.Arrays;

public  class PhdStudent extends Student {
	private String spsub;
	private int marks[];
	private int spsubmark;

	public PhdStudent() {
		//super();
		this.spsub=null;
		this.spsubmark=0;
	}
	public PhdStudent(String name,String address,int marks[],String spsub,int spsubmark) {
		super(name,address);
		this.spsub=spsub;
		this.marks=marks;
		this.spsub=spsub;
		this.spsubmark=spsubmark;
	}
	public float calculatePer() {
		return (calTotal()*100)/400;
	}
	private int calTotal() {
		
		return marks[0]+marks[1]+marks[2]+spsubmark;
	}
	
	public String toString() {
		
		return super.toString()+"PhdStudent [spsub=" + spsub + ", marks=" + Arrays.toString(marks) + ", spsubmark=" + spsubmark + "]";
	}

}

