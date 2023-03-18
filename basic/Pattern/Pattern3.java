package basic.Pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=4;++i,k=0) {
			for(int j=0;j<=4-i;++j) {
				System.out.print(" ");
			}
			
			while(k!=2*i-1) {
				System.out.print("* ");
				++k;
			}
			System.out.println();
		}
	}

}
