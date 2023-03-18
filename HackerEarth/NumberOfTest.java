package HackerEarth;
import java.util.*;

public class NumberOfTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int count=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		
		int min=5001;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>min && a[i]>b[i]) {
				while(a[i]!=min) {
					a[i]-=b[i];
					count++;
				}
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				System.out.println("-1");
				break;
			}
			else
				System.out.println(count);
			break;
			
				
				
		}
		
		
		
	}

}
