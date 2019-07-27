/**
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * For example, there are n=7 socks with colors ar = [1,2,1,2,1,3,2]. There is one pair of color 1 and one of color 2.
 * There are three odd socks left, one of each color. The number of pairs is 2.
 */



package hackerRank.interviewpreparationkit;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {


    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> res = new HashMap<>();
        int result = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (res.containsKey(ar[i])) {
                res.put(ar[i], res.get(ar[i]) + 1);
            } else {
                res.put(ar[i], 1);
            }
        }


        for (Map.Entry entry : res.entrySet()) {
            int a = (int) entry.getValue();
            while (a > 0) {
                if (a % 2 == 0) {
                    count++;
                    a = a - 2;
                } else {
                    if (a >= 1) {
                        a = a - 1;
                        if ((a != 0) && (a % 2 == 0)) {
                            count++;
                            a = a - 2;
                        }
                    }
                }
            }
            result = count;
        }
        return result;
    }


    public static void main(String[] args) {
        //int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int[] ar = {10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(9, ar));
    }
}
