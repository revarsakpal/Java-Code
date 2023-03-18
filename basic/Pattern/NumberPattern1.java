package basic.Pattern;

public class NumberPattern1 {
public static void main(String[] args) {
	
	for(int i=1;i<=4;i++) {
		 for(int j=i;j<=4;j++) 
			 System.out.print(" ");
			 for(int j=i;j>=1;j--)
				 System.out.print(j);
               for(int j=2;j<=i;j++)
            	   System.out.print(j);
			 System.out.println();
		 }
	
	  for(int i=1;i<=3;i++) {
		  for(int j=1;j<=i;j++)
			  System.out.print(" ");
		  for(int j=3;j>=1;j--)
			  System.out.print(j);
		  for(int j=2;j<=i;j++)
			  System.out.print(j);
		  System.out.println();
	  }
	
	
	
	}
}

