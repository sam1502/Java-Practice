//Given  integers, count the number of pairs of integers whose difference is .
//The first line contains  array and the number(difference). 
//Returns An integer that tells the number of pairs of integers whose difference is K.




package HackerRank;

public class Pairs {
	public static int pairs(int[] a, int k){
		int count =0;
		int n = a.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]-a[j] == Math.abs(k)){
					count++;
				}
				
			}
		}
		return count;
		
	}
	
	public static void main(String args[]){
		int a[] = {1,5,3,4,2};
		int k = 2;
		System.out.println(pairs(a,k));
	}
	
}
