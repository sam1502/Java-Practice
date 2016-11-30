//You have been given 3 integers l,r and k.
//Find how many numbers between land r (both inclusive) are divisible by k.
//You do not need to print these numbers, you just have to find their count.

import java.util.*;

class CountDivisors {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int count=0;
        
        for(int i=N;i<=a;i++){
        	if (i%b==0){
        		count++;
        	}  	
        }
        System.out.println(count);
    }
}
