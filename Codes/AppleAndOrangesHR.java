//Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
//In the diagram below, the red region denotes his house, where s is the start point and t is the end point.
//The apple tree is to the left of his house, and the orange tree is to its right.
//You can assume the trees are located on a single point, where the apple tree is at point a and the orange tree is at point b.

package HackerRank;

import java.util.Scanner;

public class AppleAndOrangesHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();

		
		//calculting the number of apples in the house!!
		int applesInHouse = 0;
		for(int i=0;i<m;i++){
			int applePosition = a + in.nextInt();
			if(applePosition >= s && applePosition <= t){
				applesInHouse++;
			}
		}
		System.out.println(applesInHouse);
		
		//calcualating the number of oranges in the house!!
		int orangesInHouse = 0;
		for(int i=0;i<n;i++){
			int orangePosition = b + in.nextInt();
			if(orangePosition >=s && orangePosition <= t){
				orangesInHouse++;
			}
		}
		System.out.println(orangesInHouse);
		
	}

}
