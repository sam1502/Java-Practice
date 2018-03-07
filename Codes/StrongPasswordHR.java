//Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:
//Its length is at least 6.
//It contains at least one digit.
//It contains at least one lowercase English character.
//It contains at least one uppercase English character.
//It contains at least one special character. The special characters are: !@#$%^&*()-+

import java.util.Scanner;

public class StrongPasswordHR {
	
	static int minimumNumber(int n, String pass){
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean digit = false;
		int count =0;
		if(n < 6){
			return (6- n);
		}
		else {
			for(int i=0; i<n; i++){
				if(Character.isUpperCase(pass.charAt(i))){
					upperCase = true;
					continue;
				}
				if(Character.isLowerCase(pass.charAt(i))){
					lowerCase = true;
					continue;
				}
				if(Character.isDigit(pass.charAt(i))){
					digit = true;
					continue;
				}
			}
			if(upperCase != true){
				++count;
			}
			if(lowerCase != true){
				++count;
			}
			if(digit != true){
				++count;
			}
			if(pass.matches(".*[!@#$%^&*()\\-+].*")){
				++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();

	}

}
