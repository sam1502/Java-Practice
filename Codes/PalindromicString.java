import java.util.*;

class PalindromicString {
    public static void main(String args[] ) throws Exception {
    	
        //Scanner
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String reverse ="";
        for(int i=a.length()-1;i>=0;i--){
        	reverse = reverse+a.charAt(i);
        }
        if(a.equalsIgnoreCase(reverse)){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("N0");
        }
    }
}
