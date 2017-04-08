//You have an array of integers, and for each index you want to 
//find the product of every integer except the integer at that index.
//runtime of O(n2).

public class GetProductExceptIndex {
	
	public static void getProductsOfAllIntsExceptAtIndex(int arr[])
	{
		int n = arr.length;
		int prod[] = new int[n];
		for (int i = 0;  i < n;  i++)
		{
		    prod[i] = 1;
		    for (int j = 0;  j < n;  j++)
		        if (j != i)    // Exclude element at the current index
		            prod[i] *= arr[j];
		}
		for(int i=0 ;i<n;i++)
		{
		System.out.println(prod[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		getProductsOfAllIntsExceptAtIndex(arr);
	}
}
