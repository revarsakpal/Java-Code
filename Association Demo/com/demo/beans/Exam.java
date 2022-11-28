package com.demo.beans;

import java.util.Arrays;
import java.util.Date;

public class Exam {
	private int eid;
	private  String ename;
	private String etopic;
	private Questions [] ques;
	private Date examdate;
	private static int count;
	static {
		count=0;
		//System.out.println("SELECT ::\t 1:JAVA\t\t 2:HTML\t\t3:EXIT");
	}
	
	public Exam() {
		this.eid = count;
		this.ename =null;
		this.etopic = null;
		this.ques = null;
		this.examdate = null;
	}

	public Exam(int eid, String ename, String etopic, Questions[] ques, Date examdate) {
		this.eid = eid;
		this.ename = ename;
		this.etopic = etopic;
		this.ques = ques;
		this.examdate = examdate;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtopic() {
		return etopic;
	}
	public void setEtopic(String etopic) {
		this.etopic = etopic;
	}
	public Questions[] getQues() {
		return ques;
	}
	public void setQues(Questions[] ques) {
		this.ques = ques;
	}
	public Date getExamdate() {
		return examdate;
	}
	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}

	@Override
	public String toString() {
		return "Exam [eid=" + eid + ", ename=" + ename + ", etopic=" + etopic + ", ques=" + Arrays.toString(ques)
				+ ", examdate=" + examdate + "]";
	}


}
	
