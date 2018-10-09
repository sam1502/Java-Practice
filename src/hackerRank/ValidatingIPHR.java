package hackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingIPHR {
	
	private static boolean validate(String s){
	Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
    Matcher mtch = ptn.matcher(s);
    return mtch.find();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String ip = in.next();
			System.out.println(validate(ip));
		}

	}

}
