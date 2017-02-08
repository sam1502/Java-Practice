//Array consist of -1 and 1, Find count of all sub-arrays where sum = 0. 
//Ex. [-1,1,-1,1] 
//Ans : 4 

//Ex. [-1,-1,1,1] 
//Ans : 2 [-1,1][-1,-1,1,1]



public class Array_sum1 {
	
	public static int CountZero(int arr[]){
		int result = 0;
		for(int i=0;i<arr.length;i++){
			int sum = arr[i];
			for(int j=i+1;j<arr.length;j++){
				sum = sum+arr[j];
				if(sum == 0)
					result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountZero(new int[]{-1,1,-1,1}));            //4
		System.out.println(CountZero(new int[]{1,-1,-1,1,-1,-1,1}));    //6
		System.out.println(CountZero(new int[]{1,-1}));					//1
		System.out.println(CountZero(new int[]{-1}));					//0

	}

}
