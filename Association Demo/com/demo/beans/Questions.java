package com.demo.beans;

public class Questions {
	private int quesno;
	private String ques;
	private String[] option;
	private char ans;
	private static int marks;
	private static int count;
	static {
		count=0;
		marks=1;
	}

	public Questions() {
		this.quesno=0;
		this.ques=null;
		this.option=option;
		this.ans=0;
		this.marks=0;
	}
	public Questions(int quesno,String ques,String [] option,char ans) {
		this.quesno=quesno;
		this.ques=ques;
		this.option=option;
		this.ans=ans;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public String[] getOption() {
		return option;
	}

	public void setOption(String[] option) {
		this.option = option;
	}

	public char getAns() {
		return ans;
	}

	public void setAns(char ans) {
		this.ans = ans;
	}

	public static int getMarks() {
		return marks;
	}

	public static void setMarks(int marks) {
		Questions.marks = marks;
	}
 
	public String toString() {
		String str="";
		str+="\n\n\n"+quesno+"."+" "+ques+"\t"+"Marks:"+marks +"\n"+"A:"+option[0]+"\n"+"B:"+option[1]+"\n"+"C:"+option[2]+"\n"+"D:"+option[3];
		return str;
	}
	

}
	
