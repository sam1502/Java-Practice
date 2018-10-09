/*Input: J = "aA", S = "aAAbbbb"
Output: 3


Input: J = "z", S = "ZZ"
Output: 0

*/


package hackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JewelsAndStonesLC {
	
	private static int evaluate(String J, String S){
		int count = 0;
		if(S == null || J == null){
			return 0;
		}
		Set<Character> res = new HashSet<>();
		
		char[] s1 = S.toCharArray();
		char[] j1 = J.toCharArray();
		
		for(char jewel : j1){
			res.add(jewel);
		}
		
		for(char stones : s1){
			if(res.contains(stones)){
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String J = in.next();
		String S = in.next();
		
		System.out.println(evaluate(J,S));
		in.close();

	}

}
