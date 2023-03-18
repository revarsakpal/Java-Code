package basic.array;

public class NumberFrequency {
	public static void main(String[] args) {
		int arr1[]= {1,2,1,3,5,1,3,2,5,3,1,2,3,5,2,1,2,3,6,5,1,2,3,6,5,4};
		int arr2[]=new int[8];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[arr1[i]]=arr2[arr1[i]]+1;
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]!=0)
			System.out.println(i+"-->"+arr2[i] );
		}
		
	}

}
