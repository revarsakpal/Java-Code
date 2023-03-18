package basic;

import java.util.Scanner;

public class CheckCharacterAlphabet {

	public static void main(String[] args) {
		char ch='a';
        System.out.println("Enter character to check");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        System.out.println("Enter character is alphabet");
        else
        System.out.println("Enter character is not alphabet");
	}

}
