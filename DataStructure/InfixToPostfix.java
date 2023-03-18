package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String exp=sc.next();
		Stack<Character> stk=new Stack<>();
		String postexp="";
		
		for(int i=0;i<exp.length();i++) {
			if(Character.isLetterOrDigit(exp.charAt(i))) {
				postexp+=exp.charAt(i);}
				else if(exp.charAt(i)==')' && stk.isEmpty()) {
					System.out.println("Invalid Expression");
				}
				else if(exp.charAt(i)=='(') {
					stk.push(exp.charAt(i));
					
				}
				
			}
		}
		
		
	}


