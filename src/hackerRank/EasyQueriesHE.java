package hackerRank;

/*
 * You are given an empty list A and Q queries. Each query is one of the following:
 * 1) 1 X Y: add element X to the list Y times
 * 2) 2 N : find the Nth element in list A
 * 
 * 
 * 
 *Input:
 *4
 *1 5 5
 *1 3 6
 *2 7 -----> Output : 5
 *2 6 -----> Output : 3
 * 
 * */




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EasyQueriesHE {
	static Scanner in = new Scanner(System.in);
	
	public static void addEle(int ini,List<Integer> ll){
		
		if(ini == 1){
			int ele = in.nextInt();
			int noOfTimes = in.nextInt();
			
			for(int i=0;i<noOfTimes;i++){
				ll.add(ele);
			}
		}else{
			if(ini == 2){
				int index =in.nextInt();
				Collections.sort(ll);
				int a = ll.get(index-1);
				System.out.println(a);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<>();
		int queries = in.nextInt();
		
		for(int i=0;i<queries;i++){
		int ini = in.nextInt();
		
		addEle(ini,ll);
		}

	}

}
