package com.demo.services;

import java.util.Scanner;

import com.demo.beans.Questions;

public class QuestionServices {
	private static Questions [] ques=new Questions[10];
	//private static Questions [] HTML=new Questions[5];
	//	private static char[] javaAns=new char[5];
	private static int marks;
	private static char ans[];
	static {
		System.out.println("\n");
		ques[0]=new Questions(1,"Who invented Java Programming?",new String[] {"Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup"},'B') ;
		ques[1]=new Questions(2,"Which statement is true about Java?",new String[] {"Java is a sequence-dependent programming language","Java is a code dependent programming language",
				"Java is a platform-dependent programming language",
		"Java is a platform-independent programming language"},'D') ;
		ques[2]=new Questions(3,"Which component is used to compile, debug and execute the java programs?",new String[] {"JRE","JIT","JDK","JVM"},'C') ;
		ques[3]=new Questions(4,"Which one of the following is not a Java feature?",new String[] {"Object-oriented","Use of pointers","Portable","Dynamic and Extensible"},'B') ;
		ques[4]=new Questions(5,"Which of these cannot be used for a variable name in Java?",new String[] {"identifier & keyword","identifier","keyword","none of the mentioned"},'C') ;

		ques[5]=new Questions(1,"What does the abbreviation HTML stand for?",new String[] {"Hyper Text Markup Language","High Test Makeup Langauge","HyperText Markdown Langauge","None Of Above"},'A') ;
		ques[6]=new Questions(2,"How many sizes of headers are available in HTML by default?",new String[] {"5","1","3","6"},'D') ;
		ques[7]=new Questions(3,"What is the smallest header in HTML by default?",new String[] {"h1","h2","h6","h4"},'C') ;
		ques[8]=new Questions(4,"What are the types of lists available in HTML?",new String[] {"Ordered ,Unordered List","Bullted,Number List","Names,Unnamed List","None Of the Above"},'A') ;
		ques[9]=new Questions(5,"How to create an ordered list in HTML?",new String[] {"<ul>","<ol>","<href>","<b>"},'B') ;
		marks=0;
		ans= new char[5];
	}

	public static void displayJavaTest() {
		System.out.println("::Java Programing MCQ::");
		//System.out.println("Answer should be in capital letter A/B/C/D");
		int i=0;
		for(int j=0;j<5;j++) {
			System.out.println(ques[j]);
			getAnswer(i);i++;
		}
		showResult(0,5);
	}

	public static void displayHTMLTest() {
		System.out.println("::HTML Programing MCQ::");
		int i=0;
		for(int j=5;j<ques.length;j++) {
			System.out.println(ques[j]);
			getAnswer(i);i++;
		}
		showResult(5,10);
	}


	private static void showResult(int start,int end) {
		int marks=0;

		///System.out.println("star"+start);
		//System.out.println("End"+end);
		
		for(int i=start, k=0;i<end;i++,k++){
			if(ques[i].getAns()==Character.toUpperCase(ans[k]))
				marks++;
			
		}
		System.out.println("\nCorrect Answers are:");
		for(int i=start, k=0;i<end;i++,k++){
			System.out.print(ques[k].getAns()+"\t");
		}
		System.out.println("\nYour given Answers are:");
		for(int i=start, k=0;i<end;i++,k++){
			System.out.print(Character.toUpperCase(ans[k])+"\t");
		}
		if(marks>=3)
			System.out.println("\nYou have got "+marks+" marks.... Congratulations!!");
		else
			System.out.println("\nYou have got "+marks+ " marks...You are Fail!!");
		     
		 
	}


	private static void getAnswer(int j) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Answer:");
		ans[j]=sc.next().charAt(0);

	}



}
