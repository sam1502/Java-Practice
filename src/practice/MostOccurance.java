package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostOccurance {

    public static String printResult(String str) {
        String result  = "";

        Map<Character, Integer> res = new HashMap<>();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for(int i= 0 ;i<arr.length;i++) {
            if(res.containsKey(i)) {
                res.put(arr[i], res.get(i)+1);
            }
            else
                res.put(arr[i], 1);
            System.out.println(res);
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();


        System.out.println(printResult(str));
    }
}
