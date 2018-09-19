/*For this problem, we have 2 types of queries you can perform on a List:
	Insert y at indesx x:
		Insert
		x y
	Delete the element at Insex x:
		Delete
		x
*/
package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaListHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        ArrayList<Integer> list = new ArrayList<>();
	        for (int i = 0; i < N; i++) {
	            list.add(in.nextInt());
	        }
	        
	        /* Perfrom queries on Linked List */
	        int q = in.nextInt();
	        for (int i = 0; i < q; i++) {
	            String action = in.next();
	            if (action.equals("Insert")) {
	                int index = in.nextInt();
	                int value = in.nextInt();
	                list.add(index, value);
	            } else { // "Delete"
	                int index = in.nextInt();
	                list.remove(index);
	            }
	        }
	        in.close();
	        
	        /* Print our updated Linked List */
	            System.out.print(list);
	        
	    }
	}