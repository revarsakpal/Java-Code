package basic;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int origin=n;
		int sum=0;
		while(n>0) {
			int n1=n%10;
			sum=sum+n1*n1*n1;
			n=n/10;
		}
		if(sum==origin)
			System.out.println("Arnmstrong number");
		else
			System.out.println("Not armstrong number");
		
	}

}
