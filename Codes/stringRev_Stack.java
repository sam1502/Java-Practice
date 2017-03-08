// Reversing a string using stacks.


import java.util.Scanner;
import java.util.Stack;

public class stringRev_Stack {
   public static void main(String[] args) {
      System.out.println("Enter a sentence: ");
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      Stack<Character> theStack = new Stack<Character>();
      
      for (int j = 0; j < input.length(); j++) {
         char ch = input.charAt(j);
         theStack.push(ch);
      } 
      while (!theStack.isEmpty()) {
         char ch = (char) theStack.pop();
         System.out.print(ch);
      } 
   }
}