package com.demo.beans;

import java.util.Arrays;

public class MScStudent extends Student{
	private int marks[];

	public MScStudent() {

		this.marks=new int[3];
	}

	public MScStudent(String sname,String address,int marks[]) {
		super(sname,address);
		this.marks=marks;
	}

	public float calculatePer() {
		return (calculateTotal()*100)/300;
	}

	private int calculateTotal() {
		return marks[0]+marks[1]+marks[2];
	}


	public String toString() {
		return super.toString() +"MScStudent marks=" + Arrays.toString(marks) + "]";
	}


}
