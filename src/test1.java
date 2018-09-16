
public class test1 {

	static int binarySearch(int arr[],int low, int high, int key){
		if(high<low){
			return -1;
		}
		int mid = (high+low)/2;
		if(key == arr[mid]){
			return mid;
		}
		else if(key > arr[mid]){
			return binarySearch(arr, mid+1, high, key);
		}
		return binarySearch(arr, low, mid-1, key);
	}
	
	static int deleteElement(int arr[],int pos){
		for(int i=pos;i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		
		return arr.length-1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[6];
		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 14;
		arr[3] = 20;
		arr[4] = 40;
		arr[5] = 70;
		
		int n = arr.length;
		int key = 40;
		
		int pos = binarySearch(arr,0,n,key);
		System.out.println(pos);
		deleteElement(arr,pos);
	}

}
