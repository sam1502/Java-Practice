package hackerRank;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				String input=in.next();
		          Stack<Character> s = new Stack();
		          boolean isBalanced = true;
		          for(char c : input.toCharArray()) {
		              switch (c) {
		                  case '{':
		                  case '(':
		                  case '[':
		                    s.push(c);
		                    break;
		                  case '}':
		                    if (!s.empty() && s.peek() == '{')
		                        s.pop();
		                    else
		                        isBalanced = false;
		                    break;
		                  case ')':
		                    if (!s.empty() && s.peek() == '(')
		                        s.pop();
		                    else
		                        isBalanced = false;
		                    break;
		                  case ']':
		                    if (!s.empty() && s.peek() == '[')
		                        s.pop();
		                    else
		                        isBalanced = false;
		                    break;
		              }
		          }
		          if (!s.empty() || !isBalanced){
		              System.out.println("false");
		          } else
		              System.out.println("true");
		      }
		      
		   }
		}