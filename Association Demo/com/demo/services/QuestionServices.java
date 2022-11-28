package com.demo.services;

import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Exam;
import com.demo.beans.Questions;

public class QuestionServices {
	static Exam []exam=new Exam[2];
	private static Questions [] java=new Questions[5];
	private static Questions [] html=new Questions[5];
	private static int marks;
	private static char ans[];
	static {//initializing two arrays for two topics
		System.out.println("\n");
		java[0]=new Questions(1,"Who invented Java Programming?",new String[] {"Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup"},'B') ;
		java[1]=new Questions(2,"Which statement is true about Java?",new String[] {"Java is a sequence-dependent programming language","Java is a code dependent programming language",
				"Java is a platform-dependent programming language",
		"Java is a platform-independent programming language"},'D') ;
		java[2]=new Questions(3,"Which component is used to compile, debug and execute the java programs?",new String[] {"JRE","JIT","JDK","JVM"},'C') ;
		java[3]=new Questions(4,"Which one of the following is not a Java feature?",new String[] {"Object-oriented","Use of pointers","Portable","Dynamic and Extensible"},'B') ;
		java[4]=new Questions(5,"Which of these cannot be used for a variable name in Java?",new String[] {"identifier & keyword","identifier","keyword","none of the mentioned"},'C') ;

		html[0]=new Questions(1,"What does the abbreviation HTML stand for?",new String[] {"Hyper Text Markup Language","High Test Makeup Langauge","HyperText Markdown Langauge","None Of Above"},'A') ;
		html[1]=new Questions(2,"How many sizes of headers are available in HTML by default?",new String[] {"5","1","3","6"},'D') ;
		html[2]=new Questions(3,"What is the smallest header in HTML by default?",new String[] {"h1","h2","h6","h4"},'C') ;
		html[3]=new Questions(4,"What are the types of lists available in HTML?",new String[] {"Ordered ,Unordered List","Bullted,Number List","Names,Unnamed List","None Of the Above"},'A') ;
		html[4]=new Questions(5,"How to create an ordered list in HTML?",new String[] {"<ul>","<ol>","<href>","<b>"},'B') ;
		marks=0;
		ans= new char[5];
		exam[0]=new Exam(1,"JAVA MCQ TEST","BASIC JAVA",java,new Date(28/11/2022));
		exam[1]=new Exam(1,"HTML MCQ TEST","BASIC HTML",html,new Date(30/11/2022));
	}

//display exam topic
	public static void displayTopic() {
		for(int i=0;i<exam.length;i++) {
			int num=i+1;
			System.out.print("\t"+num+"."+exam[i].getEname()+"\t");
		}
	}

	//display question & getting input of answers
	public static void displayTest(int choice) {
			System.out.println("\nExam Topic::"+exam[0].getEtopic()+"\t"+"Exam Date:"+exam[0].getExamdate());
			int i=0;
			for(int j=0;j<java.length;j++) {
				System.out.println(exam[choice-1].getQues()[j]);
				getAnswer(j);
			
			showResult(choice);
		
	}}

	//getting input of answers from user
	private static void getAnswer(int j) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Answer:");
		ans[j]=sc.next().charAt(0);

	}
//display result
	private static void showResult(int choice) {
		int marks=0;

		for(int i=0;i<exam[choice-1].getQues().length;i++){
			if(exam[choice-1].getQues()[i].getAns()==Character.toUpperCase(ans[i]))
				marks++;
		}

		System.out.println("\nCorrect Answers are:");
		for(int i=0;i<exam[choice-1].getQues().length;i++){
			System.out.print(exam[choice-1].getQues()[i].getAns()+"\t");
		}
		System.out.println("\nYour given Answers are:");
		for(int i=0;i<ans.length;i++){
			System.out.print(Character.toUpperCase(ans[i])+"\t");
		}
		if(marks>=3)
			System.out.println("\nYou have got "+marks+" marks.... Congratulations!!");
		else
			System.out.println("\nYou have got "+marks+ " marks...You are Fail...Better Luck Next Time");
	}

}









