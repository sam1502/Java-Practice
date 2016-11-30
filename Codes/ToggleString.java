//You have been given a String S
//consisting of uppercase and lowercase English alphabets.
//You need to change the case of each alphabet in this String.
//That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase.
//You need to then print the resultant String to output.

import java.util.*;

class ToggleString {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        for(int i=0;i<a.length();i++){
        	char c = a.charAt(i);
        	if(c>=97 && c<=122){
        		c-=32;
        	}
        	else{
        		c+=32;
        	}
        	System.out.print(c);
     }
    }
}
