public class test{
	
	static int insertInSortedArr(int arr[],int n,int key, int capacity){
		if(n >= capacity){
			return n;
		}
		int i;
		for(i=n-1; (i>0 && arr[i] > key); i--)
			arr[i+1] = arr[i];
		
		arr[i+1] = key;
		return (n+1);
	}
	
	static void view(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	
	
	
	public static void main(String args[]){
		int arr[] = new int[20];
		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 14;
		arr[3] = 20;
		arr[4] = 40;
		arr[5] = 70;
		
		int capacity = arr.length;
		int key = 26;
		int n =6;
		System.out.println(insertInSortedArr(arr,n,key,capacity));
		view(arr);	
	}
}