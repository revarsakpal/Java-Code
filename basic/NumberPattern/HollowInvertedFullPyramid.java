package basic.NumberPattern;

public class HollowInvertedFullPyramid {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++)
			{
				if(j==1 || j==5 || j==i||i==1)
				System.out.print(" "+j);
				else 
					System.out.print("  ");
			     
			}
			
				System.out.println();
		}
	}

}

/*
 1 2 3 4 5
 2     5
 3   5
 4 5
 5
 */