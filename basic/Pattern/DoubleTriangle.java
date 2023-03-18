package basic.Pattern;

public class DoubleTriangle {

	public static void main(String[] args) {
		int k=4;
		for(int i=1;i<=9;i++) {
			if(i<5) {
			for(int j=1;j<=i;j++)
				System.out.print("*");}
			else
			{
				 
				for(int j=k;j>1;j--)
					System.out.print("*");
				k--;
			}
			System.out.println();
		}
	}
}


/*
*
**
***
****
***
**
*
*/