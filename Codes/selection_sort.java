// Simple Java code for Selection Sort
// Function to sort array (Selection sort)
public class selection_sort {
	
	void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
 
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
void printarray(int arr[]){
	int n = arr.length;
	for(int i=0;i<n;i++){
		System.out.println(arr[i]+ " ");
	System.out.println();
	}
}
	public static void main(String[] args) {
		selection_sort ob = new selection_sort();
		int arr[] = {64,25,12,11,22};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printarray(arr);

	}

}
