package basic;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
System.out.println("Enter character");
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println("Ascii value for "+ch+" is "+(int)ch );

	}

}
