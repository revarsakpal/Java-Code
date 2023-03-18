package HackerEarth;



import java.util.*;


class AliceLibrary {
	public static void main(String args[] ) throws Exception {


		//Scanner
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();   
		Stack<String> stk=new Stack<>();  
		String temp="";
		for(int i=0;i<str.length()-1;i++){
			
              if(str.charAt(i)!='/' && str.charAt(i)!='\\') {
            	  temp=temp+str.charAt(i);
              }			
              else
              {
            	  stk.push(temp);
            	  temp="";
            	  continue;
              }

		}
		
		System.out.println(stk);
		
		
		}
	}

