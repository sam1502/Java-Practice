package com.Practice;

import java.util.Scanner;

public class CommonStringCC {
	
	
	public static void CommonAlp(String s, String s1){
		char[] a = s.toCharArray();
		char[] b = s1.toCharArray();
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i] == b[j]){
					System.out.print(a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Strings : ");
		String c1 = in.next();
		in.nextLine();
		String c2 = in.nextLine();
		
		CommonAlp(c1,c2);
	}

}
