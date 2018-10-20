package hackerRank;

import java.util.Scanner;

public class StrangeAttendanceSystemHE {
	
	
	public static int calculate(int classesH, int classesA){
		int result = 0;
		double r = (double)1/classesH;
		double res1 = classesA * r;
		double perc = res1 * 100;
		if(perc > 75){
			return 0;
		}
		else{
			return (int)Math.abs((classesH*3-classesA*4));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		for(int i=0;i<testcases;i++){
			int classesHeld = in.nextInt();
			int classesAttended = in.nextInt();
			
			System.out.println(calculate(classesHeld,classesAttended));
		}

	}

}
