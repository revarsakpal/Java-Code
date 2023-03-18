package Number;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		
			System.out.println("Enter number");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int flag=0;
			
			int sq=n*n;
			System.out.println("sqaure is: "+sq);
			while(n>0) {
				if((n%10)!=(sq%10))
					{flag=1;
				break;}
				else {
					n=n/10;
				    sq=sq/10;
				    }
				
			}
			
			if(flag==0) {
				System.out.println("Automorphic number");}
				else {
					System.out.println("Not automorphic");}
			}
	}

