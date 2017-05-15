//Given an integer array, you have to find all the leader elements in this array.
//An element is said to be leader if all the elements on it’s right side are smaller than it.
//Rightmost element is always a leader.
//For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.



package JavaConceptOfTheDay;

public class LeaderInArray {
	
	public static void DisplayLeaders(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			boolean flag = true;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] > arr[i]){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,9,7,14,8,6,3};
		DisplayLeaders(arr);

	}

}
