//Print out the unpaired element from the array.

package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PairElements {
	
	public static void Solution(int[] arr){
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		
		
		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count++;
					hp.put(arr[i], count);
				}
			}
		}
			Iterator it = hp.entrySet().iterator();
			while(it.hasNext()){
				Map.Entry<Integer,Integer> pair = (Map.Entry) it.next();
				//System.out.println(pair.getKey()+ " = " +pair.getValue());
				if(pair.getValue() %2 != 0){
					System.out.println(pair.getKey());
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,3,9,3,9,7,9};
		Solution(arr);
	}

}
