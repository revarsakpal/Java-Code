package basic.array;
import java.util.Scanner;

public class RorateArrayLeft {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\nnumber of rotation");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int first=arr[0];
			int j;
			for( j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}		

		System.out.println("Rorated  Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
      
	}

}
