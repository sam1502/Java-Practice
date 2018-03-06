/*
 * Please write a method which will take in a string as a parameter.
 * Assume the string passed in will always contain only letters of the alphabet.
 * The method should return a string which contains the distinct list of letters from the original string (all duplicates should be removed).
 * The letters in the returned string should also be in alphabetical order.

Example: ABRACADABRA
Returns: ABCDR
*/



import java.util.*;

public class DuplicateRemoval{
public static void DupliRemv(String str){
    ArrayList<Character> list = new ArrayList<Character>();
    char[] letters = str.toCharArray();
    Arrays.sort(letters);
    char prev = letters[0];
    list.add(prev);
    for(int i =1;i<letters.length;i++){
        if(!(prev == letters[i])){
            list.add(letters[i]);
        }
        prev = letters[i];
    }
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
}
public static void main(String[] args){
	System.out.println("Enter the String to check for duplicates");
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    DupliRemv(str);
    }
}
    