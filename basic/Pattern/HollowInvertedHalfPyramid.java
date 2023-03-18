package basic.Pattern;

public class HollowInvertedHalfPyramid {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++)
				{if(i==1 || j==1 || j==6-i+1) 
				System.out.print("*");
				else 
					System.err.print(" ");}
			System.out.println();
		}
		
	}

}
	