// Add two numbers represented as strings without using parseInt.

public class AddStringWParsing {

	public static void main(String[] args) {
		String str = "1234";
		String str1 = "4567";
		int Ans = 0, unit = 1;
	    for (int i = str.length()-1; i >= 0; i--) {
	        Ans += (str.charAt(i)-'0') * unit;
	        unit *= 10;
	    }
	    System.out.println(Ans);
	    
	    
	    int Ans1 = 0, unit1 = 1;
	    for (int i = str1.length()-1; i >= 0; i--) {
	        Ans1 += (str1.charAt(i)-'0' ) * unit1;
	        unit1 *= 10;
	    }

	    System.out.println(Ans1);
	    System.out.println(Ans1+Ans);
	
	
	

}
}