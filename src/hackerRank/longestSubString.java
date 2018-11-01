package hackerRank;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class longestSubString {
	
 public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        LinkedHashMap<Character,Integer> chaPos = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
        	char curr = s.charAt(i);
        	if(!chaPos.containsKey(curr)){
        		chaPos.put(curr, i);
        	}
        	else{
        		i = chaPos.get(curr);
        		chaPos.clear();
        	}
        	
        	if(chaPos.size() > length){
        		length = chaPos.size();
        	}
        }
        
        return length;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(lengthOfLongestSubstring(s));
	}

}
