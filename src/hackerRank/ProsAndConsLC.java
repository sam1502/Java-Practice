package hackerRank;

/*
 * Ted: Robin, get me my legal pad. It's Pros and Cons Time!

There is a long list of n girls in front of Barney, and he is to calculate the optimal "happiness" he can find by selecting exactly 2 girls. (Why 2? No one knows!)

Ted, as a fan of pros and cons, suggests to make a list, a method for estimating the maximum happiness that Barney can achieve.

Each girl is characterized by two parameters:

- favour: if this girl is chosen, his happiness increases by this amount. 
- anger: if this girl is not chosen, his happiness decreases by this amount.

Find the maximum "happiness" that Barney can obtain. Note that the answer is allowed to be negative.

Input:
The first line of input file contains an integer t, denoting the number of test cases to follow.

The first line of each test case contains an integer n, as explained in statement. It is followed by n lines, each containing two space-seperated integers denoting the favour and anger of the ith girl.
 * 
 * 
 * 

 * Input:
1
4
2 3
10 2
11 5
4 1



output :17
 */


import java.util.*;

class ProsAndConsLC {
   public static void main(String args[] ) throws Exception {
        
        Scanner s=new Scanner(System.in);
		
		//System.out.println("enter t");
		int t=s.nextInt();
		for(int i=0; i<t; i++)
		{
			int n=s.nextInt();
			long[] happy=new long[n];
			long x,y;
			long sum=0;
			for(int j=0; j<n; j++)
			{
				x=s.nextLong();
				y=s.nextLong();
				happy[j]=x+y;
				sum+=y;
			}
			
		    long max1=Long.MIN_VALUE,max2=Long.MIN_VALUE;
            for(int j=0; j<n; j++)
            {
            	if(happy[j] > max1)
            	{
            		max2=max1;
            		max1=happy[j];
            	}
            	else if(happy[j] < max1 && happy[j] > max2)
            		max2=happy[j];
            }
			
            System.out.println(max1+max2-sum);
		}
        
    }
}