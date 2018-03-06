
//Manipulating numbers is at the core of a programmer's job. To test how well you know their properties, you are asked to solve the following problem.
//You are given n non-negative integers a1,a2, ...,an. You want to know whether it's possible to construct a new integer using all the digits of these numbers such that it would be divisible by . 
//You can reorder the digits as you want. The resulting number can contain leading zeros.




import java.util.Scanner;

public class ConstructingANumberHR {

    static String canConstruct(int[] a) {
        long sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];    
        }
        String result = null;
        if(sum % 3 == 0){
            result = "Yes";
        }
        else
            result = "No";
        return result;
        // Return "Yes" or "No" denoting whether you can construct the required number.
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = canConstruct(a);
            System.out.println(result);
        }
        in.close();
    }
}

