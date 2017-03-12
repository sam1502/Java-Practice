package stringpractice;

import java.util.Scanner;
import java.util.Stack;

public class StringRev_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<Character>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.nextLine();
		
		for(char c : s.toCharArray()){
			st.push(c);
		}
		System.out.println("Stack is: "+st );

		String output = "";
		while(!st.isEmpty()){
			char ch = st.pop();
			output = output + ch;
		}
		System.out.println(output);
	}

}
