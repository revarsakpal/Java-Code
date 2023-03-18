package basic.NumberPattern;

public class FullPyramid {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=i;
			for(int j=i;j<=5;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			  System.out.print(k++);
			k=k-2;
				for(int j=1;j<i;j++)
				  System.out.print(k--);
			
			
			System.out.println();
		}
	}

}

/*
o/p

1
232
34543
4567654
567898765
*/