/*A family consists of x members. You are given the task to book flight tickets for these x members.
You are given the following information about the airline in which you have to book the tickets:

initial cost : 6000 
Available seats : 10 
min seats for low price : 5 
Hiked price : 6500 
seats to book : 7

Monk books 5 tickets for price 6000 each and rest 2 for price 6500 each.
Total expenditure = 6000*5+6500*2 = 43000


*/




package hackerRank;

import java.util.Scanner;

public class TotalCostOCT18HE {
	
	
	public static void calculate(int iniCost,int availSeats,int minSeatsForLowCost,int hikedCost,int noOfTickets){
		int expenditure = 0;
		for(int i=noOfTickets;i>=1;i--){
			if(minSeatsForLowCost >= availSeats){
				expenditure = expenditure+hikedCost;
				noOfTickets--;
				availSeats--;
			}
			else{
			expenditure = expenditure+iniCost;
			noOfTickets--;
			availSeats--;
			}
		}
		
		System.out.println(expenditure);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int iniCost = in.nextInt();
		int availSeats = in.nextInt();
		int minSeatsForLowCost = in.nextInt();
		int hikedCost = in.nextInt();
		int noOfTickets = in.nextInt();
		
		calculate(iniCost,availSeats,minSeatsForLowCost,hikedCost,noOfTickets);

	}

}
