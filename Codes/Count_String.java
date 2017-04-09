//Simple Java Program to count the number of each charachter in the given String.

import java.util.HashMap;

class Count_String
{
    static void characterCount(String inputString)
    {
    	HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray(); 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
            	charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            	charCountMap.put(c, 1);
        }
        System.out.println(charCountMap);
    }
 public static void main(String[] args){
	 characterCount("Java J2EE Java JSP J2EE");
 }
}