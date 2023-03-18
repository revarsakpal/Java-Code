package basic.array;

import java.util.Scanner;

public class RightRotateArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Array before:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("how many rotation??");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int k=1;k<=n;k++) {
		int last=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			
		}
		
		arr[0]=last;
		}
		
		System.out.println("after right rotation");
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
		
		
		
	}

}
