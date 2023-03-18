package Matrix;

public class IdentityMatrix {
	public static void main(String[] args) {
		int [][] arr= {{1,0,0},{0,1,0},{0,1,1},{0,1,1}};
		int row=arr.length;
		int col=arr[0].length;
		boolean flag=true;
		if(row!=col) {
			System.out.println("Matrix should be a square matrx");
		}
		else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if((i==j)&&(arr[i][j]!=1))
						flag=false;
					if((i!=j)&&(arr[i][j]!=0))
						flag=false;
					
				}
			}
			
			if(flag)
				System.out.println("Identity Matrix");
			else
				System.out.println("Not Identity Matrix");
			
			
			
		}
		
		
	}

}
