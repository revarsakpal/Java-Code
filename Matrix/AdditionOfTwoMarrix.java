package Matrix;

public class AdditionOfTwoMarrix {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{4,5,6}};
		int arr1[][]= {{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("+");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=");
		int row=arr.length;
		int col=arr[0].length;
		int sum[][]=new int[row][col];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
		
		}
		
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum[0].length;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
