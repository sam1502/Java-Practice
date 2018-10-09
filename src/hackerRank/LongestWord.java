package hackerRank;

import java.util.Scanner;

public class LongestWord {
	
	private static void evaluate(String str){
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
	
		evaluate(str);

	}

}
