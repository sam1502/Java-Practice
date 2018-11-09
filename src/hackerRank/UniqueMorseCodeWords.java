package hackerRank;

/*
 * 
 * 
 * Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".

 */




import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueMorseCodeWords {
	
	static String[] dictionary  = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

	
	private static int uniqueMorseRepresentations(String[] words){
		Set<String> morseValues = new HashSet<>();
		
		for(String word : words){
			morseValues.add(morseCodeRep(word));
		}
		
		return morseValues.size();
		
	}
	
	
	public static String morseCodeRep(String word){
		StringBuilder representation = new StringBuilder();
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			representation.append(dictionary[c - 'a']);
		}
		return representation.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		for (String line = in.nextLine(); !line.isEmpty(); line = in.nextLine())
			{
	            al.add(line);
	        }
		
	        String [] words = new String[al.size()];
	        for(int i=0;i<al.size();i++){
	            words[i]=al.get(i);
	    }
	    System.out.println(uniqueMorseRepresentations(words));
	}

}
