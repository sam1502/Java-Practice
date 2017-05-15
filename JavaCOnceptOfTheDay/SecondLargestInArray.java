package JavaConceptOfTheDay;

public class SecondLargestInArray {
	
	public static int SecondLargest(int ar[]){
		int firstLargest;
		int secondLargest;
		if(ar[0] > ar[1]){
			firstLargest = ar[0];
			secondLargest = ar[1];
		}
		else{
			firstLargest = ar[1];
			secondLargest = ar[0];
		}
		
		for(int i=2;i<ar.length;i++){
			if(ar[i] > firstLargest){
				secondLargest = firstLargest;
				firstLargest = ar[i];
			}
			else if(ar[i] < firstLargest && ar[i] > secondLargest){
				secondLargest = ar[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {45,51,28,75,49,42};
		
		System.out.println(SecondLargest(new int[] {45,51,28,75,49,42}));
	}

}
