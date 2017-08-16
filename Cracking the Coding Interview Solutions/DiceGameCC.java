package com.Practice;

public class DiceGameCC {
	
	static int sum(int arr[]){
		int total =0;
		int n = arr.length;
		for(int i=0;i<n;i++){
			total = total+arr[i];
		}
		return total;
	}
	
	public static int randomNum(int min, int max){
		
		int randomNum = min + (int) (Math.random() * (max - min)+1);
		//System.out.println("Num  "+randomNum);
	    return randomNum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Player 1 turn : ");
		int player1[] = new int[10];
		for(int i=0;i<10;i++){
			player1[i] = randomNum(0,6);
			System.out.print(player1[i] +" ");
		}
		System.out.println(" ");
		
		System.out.println("Player 2 turn : ");
		int player2[] = new int[10];
		for(int i=0;i<10;i++){
			player2[i] = randomNum(0,6);
			System.out.print(player2[i]+" ");
		}
		System.out.println(" ");
		
		if(sum(player1) > sum(player2)){
			System.out.println("Player 1 wins with score : "+(sum(player1)));
		}
		else
			System.out.println("Player 2 wins with Score : "+sum(player2));
	}

}