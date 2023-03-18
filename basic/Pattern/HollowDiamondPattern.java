package basic.Pattern;

public class HollowDiamondPattern {
	public static void main(String[] args) {
		int row=7 , col=7;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==row || j==col || i==1 || j==1) {
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
