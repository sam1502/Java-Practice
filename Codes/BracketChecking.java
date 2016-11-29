//Given  strings of brackets, determine whether each sequence of brackets is balanced.
//If a string is balanced, print true on a new line; otherwise, print False on a new line.

import java.util.*;
public class BracketChecking{
public static boolean CheckParentesis(String str)
{
    if (str.isEmpty())			//Empty String is considered as TRUE.
        return true;

    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < str.length(); i++)
    {
        char current = str.charAt(i);
        if (current == '{' || current == '(' || current == '[')
        {
            stack.push(current);
        }


        if (current == '}' || current == ')' || current == ']')
        {
            if (stack.isEmpty())
                return false;

            char last = stack.peek();
            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                stack.pop();
            else 
                return false;
        }

    }

    return stack.isEmpty();
	}

public static void main(String[] args) {        
    String str = "({})";
    System.out.println(CheckParentesis(str)); 
	}
}
