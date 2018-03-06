//Alice wrote a sequence of words in CamelCase as a string of letters,s, having the following properties:
//It is a concatenation of one or more words consisting of English letters.All letters in the first word are lowercase.
//For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
//Given , print the number of words in s on a new line.


import java.util.Scanner;

public class CamelCaseHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 1;
        String s = in.next();
        for(int i=0;i<s.length();i++){
        	if(Character.isUpperCase(s.charAt(i))){
        		count++;
        	}
        }
        System.out.println(count);
	}

}
