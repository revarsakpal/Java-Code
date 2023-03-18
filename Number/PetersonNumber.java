package Number;

import java.util.Scanner;

public class PetersonNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int or=n;
		int sum=0;
		while(n>0) {
			int m=n%10;
			int sum1=1;
			while(m>0) {
				sum1=sum1*m;
				m=m-1;
			}
			sum=sum+sum1;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==or) {
			System.out.println("Peterson number");
		}
		else
			System.out.println("Not perterson");
	}

}
