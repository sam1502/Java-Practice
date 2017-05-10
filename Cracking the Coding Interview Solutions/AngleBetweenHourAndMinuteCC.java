package com.Practice;

import java.util.Scanner;

public class AngleBetweenHourAndMinuteCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the hours");
		int h = in.nextInt();
		
		System.out.println("Enter the minutes");
		int m = in.nextInt();
		
		int angelByHourHand = (h*60 + m)*6;
		int angleByMinuteHand = (int)((h*60 + m)*0.5);
		
		int angle = angelByHourHand - angleByMinuteHand;
		System.out.println(angle % 360);
		

	}

}
