package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Exam;
import com.demo.services.QuestionServices;

public class TestExam {

	public static void main(String[] args) {
		int choice;
		System.out.println("***** WECOME ******");


		do{
			System.out.println("\nSelect Topic::\n");
			QuestionServices.displayTopic();
			System.out.println("\t 3: EXIT");
			Scanner sc=new Scanner(System.in);
			//System.out.println();
			choice=sc.nextInt();
			switch(choice) {
			case 1:QuestionServices.displayTest(choice);
			break;
			case 2:QuestionServices.displayTest(choice);
			break;
			case 3:System.out.println("THANK YOU!!!SEE YOU AGAIN!!");
			break;
			}
			System.out.println("Do you want to try again????Y/N"); 
			char a=sc.next().charAt(0);
			if(Character.toUpperCase(a)=='N') {
				System.out.println("THANK YOU!!!SEE YOU AGAIN!!");
				System.exit(0);
			}
		}while (choice!=3);
	}

}
