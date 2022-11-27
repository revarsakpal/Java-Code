package com.demo.beans;

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
	
    
}
