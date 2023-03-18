package basic.array;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[]= {10,20,30,10,50,26,23,41,14,14};
		Arrays.sort(arr);
		int sort[]=new int[arr.length];
		int k=0;
		int i=0;
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				sort[k]=arr[i];
				k++;
			}
				
		}
		sort[k]=arr[i];
		for(int j=0;j<k+1;j++)
		System.out.print(sort[j]+" ");
		
	}

}
