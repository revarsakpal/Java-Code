package Number;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;int count=0;int first=0,second=0;int sum=0;
		while(m>0) {
			m=m/10;
			count++;
		}
		System.out.println("count: "+count);
		int k=n;
		if(count%2==0) {
			System.out.println("in");
			int x=0;
			while(x<(count/2)) {
				sum=(sum)+(k%10);
				k=k/10;
			    x++;
						
			}
			System.out.println(sum);
			second=sum;
			x=0;
			//int j=n;
			while(x<(count/2)) {
				sum=sum+(k%10);
				k=k/10;
			    x++;
			}
			first=sum;
			System.out.println(first);
			System.out.println(second);
			if(n==((first+second)*(first+second))) {
				System.out.println("Tech number");
				
			}
			else
				System.out.println("Not Tech");
			
		}
		else
		{
			System.out.println("Odd Digits");
		}
		
		
		
		
	}

}
