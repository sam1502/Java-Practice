/**
 * return the input integer with odd occurrences
 */

package codewars;

import java.util.HashMap;
import java.util.Map;

public class OddOccuranceArrayElement {

    public static int findIt(int[] a) {
        int odd = 0;

        Map<Integer, Integer> resMap = new HashMap<>();

        for(int i= 0;i<a.length;i++) {
            if(resMap.containsKey(a[i])) {
                int count = resMap.get(a[i]);
               resMap.put(a[i], count+1);
            } else
                resMap.put(a[i], new Integer(1));
        }

        for(Map.Entry<Integer, Integer> entry : resMap.entrySet()) {
            if(entry.getValue() %2 == 1) {
                odd = entry.getKey();
            }
        }

        return odd;
    }



    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        System.out.println(findIt(new int[]{10}));
        System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
