//Java program to count the number of vowels present in a String.
import java.util.*;

public class VowelsCount {

  public static void getCount(String str) {
    int vowelsCount = 0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a'||
         str.charAt(i)=='e'||
         str.charAt(i)=='i'||
         str.charAt(i)=='o'||
         str.charAt(i)=='u'){
        vowelsCount++;
      }
    }
    System.out.println(vowelsCount);
   }
  
  public static void main(String[] args){
	  Scanner input  = new Scanner(System.in);
	  System.out.println("Enter the string: ");
	  String a = input.nextLine();
	  getCount(a);
	  input.close();
  }

}