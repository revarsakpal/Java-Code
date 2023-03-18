package basic.array;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,2,7,8,8,3,8};
		System.out.println("array:");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println("duplicate elements are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.print(arr[i]+" ");
			}
		}
	}

}
