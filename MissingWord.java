package Mainclass;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		System.out.println("Enter Second String");
		String str2=sc.nextLine();
		if(str1.contains(str2))
		{
			System.out.println("String found "+str2 +" and remaing string is ");
			int index=str1.indexOf(str2);
			String str3=str1.substring(0,index);
			System.out.print(str3);
			String str4=str1.substring(index+str2.length(), str1.length());
			System.out.print(str4);
		}
		else
			System.out.println("Not Present");
	}

}
