/*Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth line. 


5 //number of lines
5 41 77 74 22 44// line 1 {the first element of line represnets the number of elements in line}
1 12 // line 2
4 37 34 36 52 // line 3
0// line 4
3 20 22 33 // line 5
5
1 3
3 4
3 1
4 3
5 5

OUTPUT:
	74
	52
	37
	ERROR!
	ERROR!
*/

package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayListHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int numLines = in.nextInt();
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for(int row = 0;row< numLines;row++){
			int d = in.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int col = 0; col < d ; col++){
				list.add(in.nextInt());
			}
			lists.add(list);
		}
		
		int q = in.nextInt();
		for(int i=0;i<q;i++){
			int x = in.nextInt();
			int y = in.nextInt();
			
			ArrayList<Integer> list = lists.get(x-1);
			if(y <= list.size()){
				System.out.println(list.get(y-1));
			}
			else{
				System.out.println("ERROR!");
			}
		}
		in.close();
	}

}
