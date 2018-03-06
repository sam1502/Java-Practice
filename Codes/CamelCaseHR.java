
import java.util.Scanner;

public class CamelCaseHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 1;
        String s = in.next();
        for(int i=0;i<s.length();i++){
        	if(Character.isUpperCase(s.charAt(i))){
        		count++;
        	}
        }
        System.out.println(count);
	}

}
