package com.demo.services;

import java.util.Scanner;

import com.demo.beans.MScStudent;
import com.demo.beans.PhdStudent;
import com.demo.beans.Student;

public class StudentServices {

	public static void addStudent(Student[] stud,int count,int choice) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Student Name");
		String name=sc.nextLine();
		System.out.println("Enter student Address");
		String address=sc.nextLine();
		System.out.println("Enter Student Marks");
		int marks[]=new int[3];
		marks[0]=sc.nextInt();
		marks[1]=sc.nextInt();
		marks[2]=sc.nextInt();
		if(choice==1) {
			stud[count]=new MScStudent(name,address,marks);
		}
		else
		{
			System.out.println("Enter special Subject");
			String sname=sc.nextLine();
			sc.next();
			System.out.println("Enter special Subject marks");
			int spmark=sc.nextInt();
			stud[count]=new PhdStudent(name,address,marks,sname,spmark);
		}
	}

	public static void displayStudent(Student[] student, int count,int choice) {
		System.out.println("choice="+choice);
		if(choice==1) {

			for(int i=0;i<count;i++) {
				System.out.println((MScStudent)(student[i]));
			}}
		else if(choice==2)
			{
               System.out.println("count="+count);
			for(int i=0;i<count;i++) {
				System.out.println((PhdStudent)(student[i]));
			}}


	}

	public static void calculatePer(Student[] student, int count,int choice) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int sid=sc.nextInt();
		if(choice==1) {
			MScStudent find=(MScStudent)(searchStudent(student,sid,count,choice));
			if(find==null)
			{System.out.println("Student not found!!");}

			else 
			{System.out.println("Percentage :"+find.calculatePer()+"%");}

		}
		else if(choice==2)
		{
			PhdStudent find=(PhdStudent)(searchStudent(student,sid,count,choice));
			if(find==null) 
			{System.out.println("Student not found!!");}
			else  
			{System.out.println("Percentage :"+find.calculatePer()+"%");}
		}

	}



	private static Student searchStudent(Student[] student, int sid,int count,int choice) {
		Student find=null;
		if(choice==1)
		{
			//MScStudent find=null;
			for(int i=0;i<count;i++)
			{
				if(student[i].getId()==sid)
				{

					find=(MScStudent)(student[i]);
				}
			}
		}
		else if(choice==2)
		{
			//PhdStudent find=null;
			for(int i=0;i<count;i++)
			{
				if(student[i].getId()==sid)
				{

					find=(PhdStudent)(student[i]);
				}
			}
		}

		return find;

	}




}
