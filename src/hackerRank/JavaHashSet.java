/*Input
5
john tom
john mary
john tom
mary anna
mary anna


output:
1
2
2
3
3
*/
package hackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> pair = new HashSet<>();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		
		for(int i=0;i<t;i++){
			pair_left[i] = in.next();
			pair_right[i] = in.next();
		}
		
		for(int i=0;i<t;i++){
			pair.add("(" + pair_left[i]+ "," + pair_right[i]+")");
			System.out.println(pair.size());
		}
		
		

	}

}
