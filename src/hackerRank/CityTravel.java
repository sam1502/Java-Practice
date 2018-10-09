package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt(); // Distance between A nad B
		int x = in.nextInt(); // KM in one normal day
		int n = in.nextInt(); // exceptions
		
		Map<Integer, Integer> daysSteps = new HashMap<>();
		for(int i=0;i<n;i++){
			int days = in.nextInt();
			int steps = in.nextInt();
			daysSteps.put(days, steps);
		}
		while(s > 0){
		int count = 0;
		if(daysSteps.containsKey(count)){
			s = s - daysSteps.get(count);
			count++;
		}
		else if(s>0){
			s = s-x;
			count++;
		}
		else
		{
			System.out.println("No");
		}
		
		System.out.println(count);
		}
		
		System.out.println(s);

	}

}
