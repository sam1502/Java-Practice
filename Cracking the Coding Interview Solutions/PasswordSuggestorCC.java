//Password Suggestor: Replace s with $ and a with @ and produce all password suggestions. 
//For Example: Password : P@ssword, P@$$word,pa$$word.

package com.Practice;

import java.util.Scanner;

public class PasswordSuggestorCC {
	
	public static void Suggestor(String pass){
		Scanner in = new Scanner(System.in);
		System.out.println("Options for password are\n 1. \n 2. \n 3.");
		int a = in.nextInt();
		
		switch(a){
		case 1:
			String p = pass.replace('s', '$');
			System.out.println(p);
			break;
		
		case 2:
			p = pass.replace('a','@');
			System.out.println(p);
			break;
			
		case 3:
			p = pass.replace('s', '$');
			p = pass.replace('a', '@');
			System.out.println(p);
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "Password";
		Suggestor(p);

	}

}
