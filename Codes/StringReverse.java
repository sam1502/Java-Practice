//Input string from user and printing its reverse.


package stringpractice;
import java.util.*;

class StringReverse{
    public static void main(String[] args){
    	System.out.println("Enter the string to be reveresed");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringReve(str);
    }
    public static void StringReve(String str){
        String reverse="";
        char[] s = str.toCharArray();
        for(int i = s.length-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}