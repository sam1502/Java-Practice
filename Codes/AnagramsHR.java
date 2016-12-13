//Two strings  and  are called anagrams if they consist same characters
//but may be in different orders.
//Java program to check if strings are anagram of each other or not.
//Print Anagrams or Not Anagrams.

import java.util.*;

public class AnagramsHR {
	static boolean isAnagram(String a, String b) {
        char c[] = a.toLowerCase().toCharArray();
        char d[] = b.toLowerCase().toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)){
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first String: ");
    String a = scan.next();
    System.out.println("Enter seconf jumbled String");
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
