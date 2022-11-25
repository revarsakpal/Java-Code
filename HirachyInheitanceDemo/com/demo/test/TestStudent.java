package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MScStudent;
import com.demo.beans.PhdStudent;
import com.demo.beans.Student;
import com.demo.services.MenuClass;
import com.demo.services.StudentServices;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Student student[]=new Student[3];
		int count=0,count1=0;
		int choice=0;
		int choice1,choice2=0;
		Student student[]=new MScStudent[3];
		Student student1[]=new PhdStudent[3];

		while(true) {
			MenuClass.displayMenu();
			choice=sc.nextInt();		
			switch(choice) {
			case 1:
				MenuClass.displayDeptMenu();
				choice1=sc.nextInt();
				switch(choice1) {
				case 1:StudentServices.addStudent(student,count,choice);count++;break;
				case 2:StudentServices.displayStudent(student,count,choice);break;
				case 3:StudentServices.calculatePer(student,count,choice);				
				break;
				case 4:break;
				}
				break;
			case 2:
				MenuClass.displayDeptMenu();
				choice2=sc.nextInt();
				switch(choice2) {
				case 1:StudentServices.addStudent(student1,count1,choice);count1++;break;
				case 2:StudentServices.displayStudent(student1,count1,choice);break;
				case 3:StudentServices.calculatePer(student1,count1,choice);				
				break;
				case 4:break;
				}
				break;

			case 3:System.out.println("Thank You !! see You Again!!");
			break;

			}
			if(choice==3)
			{break;}
		}

	}

}
