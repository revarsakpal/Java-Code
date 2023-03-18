package basic.Pattern;

public class InvertedHalfPyramid {
public static void main(String[] args) {
	for(int i=1;i<=6;i++) {
		for(int j=i;j<=6;j++)
			System.out.print("*");
		System.out.println();
	}
}

}

/*
 * o/p
 ******
 *****
 ****
 ***
 **
 **/