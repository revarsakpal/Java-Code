package basic;

import java.util.Scanner;

public class CharVowelOrConsonent {

	public static void main(String[] args) {

		System.out.println("Enter character");
		Scanner sc=	new Scanner(System.in);
		char ch= sc.next().charAt(0);

		switch(ch){
		case 'A' :
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Enter character is vowel");
			break;
		default :
			System.out.println("Enter character is consonent");
		}

	}
}

