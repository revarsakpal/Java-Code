package com.demo.test;

import java.util.Scanner;

import com.demo.services.QuestionServices;

public class TestExam {

	public static void main(String[] args) {
		int choice;
		do{
			Scanner sc=new Scanner(System.in);
			System.out.println("***** WECOME ******");
			System.out.println("SELECT ::\t 1:JAVA\t\t 2:HTML\t\t3:EXIT");
			choice=sc.nextInt();
			switch(choice) {
			case 1:QuestionServices.displayJavaTest();
			System.out.println("Do you want to try again????Y/N"); 
			char a=sc.next().charAt(0);
             if(Character.toUpperCase(a)=='N') {
            	System.out.println("THANK YOU!!!SEE YOU AGAIN!!");
            	 System.exit(0);
             }
				break;
			case 2:QuestionServices.displayHTMLTest();
				break;
			case 3:System.out.println("THANK YOU!!!SEE YOU AGAIN!!");
			break;
			}
		}while (choice!=3);
	}

}
