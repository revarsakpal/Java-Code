package HackerEarth;
import java.util.*;


class SplitHouse {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        String name = s.next();  
        name=name.toUpperCase();

       if(name.contains("HH")){
        System.out.print("No");
       }
       else
       {
        name=name.replace('.','B');
        System.out.println("Yes");
        System.out.print(name);
        
       }
    }
}
