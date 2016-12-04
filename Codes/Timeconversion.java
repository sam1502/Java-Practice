// Java program to convert time from AM-PM or PM-AM
// 12:00:30AM
// Write time in the above format.

import java.util.Scanner;

public class Timeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input Time");
		String time = input.nextLine();
		String ampm = time.substring(8);
		int hr = Integer.parseInt(time.substring(0, 2));
		int hh1 = hr,hh2=0;
		if(ampm.equals("AM")){
			if(hr==12){
				System.out.println("00"+time.substring(2,8));
				}
			else{
				System.out.println("Time is:" +time);
			}
		}
			else
	        {
	        if(hh1<12){
	            hh2=12+hh1;
	            System.out.println(Integer.toString(hh2)+time.substring(2,8));
	        }
	        else
	           System.out.println(time.substring(0,8)); 
	    }
	    
	}


}

