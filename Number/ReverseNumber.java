package Number;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int sum=0;
		
		/*
		while(n>0) {
			sum=(sum*10)+(n%10);
			n=n/10;
		}*/
		reverse(n);
		
		
		
		
		
		
	}
	
	public static void reverse(int num) {
		if(num<10) {System.out.print(num);}
		else
		{
			System.out.print(num%10);
			reverse(num/10);
		}
	}

	

}
