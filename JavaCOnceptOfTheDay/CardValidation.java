package com.Practice;

import java.text.ParseException;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class CardValidation {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the expiry date : ");
		String dt = in.nextLine();
		
		int m = Integer.parseInt(dt.substring(0, 2));;
		int year = Integer.parseInt(dt.substring(3));
		//System.out.println("Month "+m+" "+"Year "+year);
		
        LocalDate localDate = LocalDate.now();
        String todaysDate = (DateTimeFormatter.ofPattern("yyyy/MM").format(localDate));
        int todaysMonth = Integer.parseInt(todaysDate.substring(5));
        int todaysYear = Integer.parseInt(todaysDate.substring(0,4));
        //System.out.println("Month "+todaysMonth+" Year "+todaysYear);
        int yearl = year - todaysYear;
        
        System.out.println(m-todaysMonth+ " Months "+yearl+" Year left to Expire");
	}

}
