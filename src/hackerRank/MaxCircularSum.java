package hackerRank;

import java.util.Scanner; 
  
public class MaxCircularSum {
static int smallestSumSubarr(int arr[], int n) 
{ 
    int min_ending_here = 0; 
      

    int min_so_far = 2147483647; 
    
    for (int i = 0; i < n/2; i++) 
    { 
         
        if (min_ending_here > 0) 
            min_ending_here = arr[i]; 
          
 
        else
            min_ending_here += arr[i]; 
  
        min_so_far = Math.min(min_so_far, 
                               min_ending_here);          
    } 
     
    return min_so_far; 
} 
  
// Driver method 
public static void main(String[] args) 
{ 
      
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int arr[] = new int[n];
   
   for(int i=0;i<n;i++){
	   arr[i] = in.nextInt();
   }
    System.out.print("Smallest sum: "
            + smallestSumSubarr(arr, n)); 
} 
} 