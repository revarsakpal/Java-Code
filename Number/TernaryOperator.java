package Number;
import java.util.*;

public class TernaryOperator {
	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int smallest,temp;
		temp=n1>n2?n2:n1;
		smallest=temp<n3?temp:n3;
		System.out.println("Smallest:-"+smallest);
		
	}

}
