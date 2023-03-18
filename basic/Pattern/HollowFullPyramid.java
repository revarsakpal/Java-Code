package basic.Pattern;

public class HollowFullPyramid {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				if(j==1 || i==5 )
				System.out.print("*");
				else
					System.out.print(" ");
			}  
			for(int j=1;j<i;j++) {
				if(j==i-1 || i==5 )
				System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}	
	}

}

/*o/p

*
* *
*   *
*     *
*********
*/