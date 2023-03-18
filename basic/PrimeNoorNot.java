package basic;
import java.util.Scanner;

public class PrimeNoorNot {
	public static void main(String[] args) {
		System.out.println("Enter number to check prime or not??");
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				flag=1;
				
		}
		if(flag==1)
			System.out.println("number is not prime");
		else
			System.out.println("number is prime");
	}

}
