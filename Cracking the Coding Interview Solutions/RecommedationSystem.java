//Our recommendation engine looks at the items that users buy together.
//Write a function that will output the largest item association given an input of item association pairs. 
//Example Input :  {(1,2),(3,4),(4,5),(5,6)}
// Output : {(1,2),(3,6)}


package com.Practice;

import java.util.ArrayList;

public class RecommedationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input inp = new input(1,2);
		input in2 = new input(3,4);
		input in3 = new input(4,5);
		input in4 = new input(5,6);
		
		input[] in = new input[4];
		in[0] = inp;
		in[1] = in2;
		in[2] = in3;
		in[3] = in4;
		
		mergeInput(in);
	}
	
	public static void mergeInput(input in[]){
		ArrayList<input> result = new ArrayList<>();
		for(int i=0;i<in.length;i++){
			int first = in[i].it1;
			int second = in[i].it2;
			
			for(int j=i+1;j<in.length;j++){
				if(second >= in[j].it1){
					i++;
					if(second <= in[j].it2){
						second = in[j].it2;
					}
				}
			}
			
			input tempin = new input(first,second);
			result.add(tempin);
		}
		System.out.println(result.toString());
	}
}
	
	class input{
		int it1;
		int it2;
	
	
	input(int it1 , int it2){
		this.it1 = it1;
		this.it2 = it2;
	}
	
	public String toString(){
		return String.format("(%d , %d)", it1,it2);
	}
}
