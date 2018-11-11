package hackerRank;

/*
 * Input: "UD"
Output: true 

Explanation: The robot moves up once, and then down once.
All moves have the same magnitude, so it ended up at the origin where it started.
Therefore, we return true.
 * 
 * 
 * 
 */


import java.util.Scanner;

public class RobotReturnToOrigin {
	
	public static boolean whereIsRobot(String moves){
		int PositiveMoves = 0;
		int NegativeMoves = 0;
		
		for(int i=0;i<moves.length();i++){
			char c = moves.charAt(i);
			
			switch(c){
			
			case 'U' : 
				NegativeMoves++;
				break;
			case 'D' :
				NegativeMoves--;
				break;
			case 'R' : 
				PositiveMoves++;
				break;
			case 'L' :
				PositiveMoves--;
				break;
				
				default:
					break;
			}
		}
		
		return PositiveMoves == 0 && NegativeMoves == 0 ? true :false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String moves = in.nextLine();
		System.out.println(whereIsRobot(moves));
	}

}
