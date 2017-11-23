//Given  integers, count the number of pairs of integers whose difference is .
//The first line contains  array and the number(difference). 
//Returns An integer that tells the number of pairs of integers whose difference is K.




package HackerRank;

import java.util.HashSet;
import java.util.Set;

public class Pairs {
	public static int pairs(int[] a, int k){
		Set<Integer> set = new HashSet<Integer>();
	    int count = 0;
	    for(int i : a){
	        if(set.contains(i + k)) count++;
	        if(set.contains(i - k)) count++;
	        set.add(i);
	    }
	    return count;
	}
	
	public static void main(String args[]){
		int a[] = {1,5,3,4,2};
		int k = 2;
		System.out.println(pairs(a,k));
	}
	
}
