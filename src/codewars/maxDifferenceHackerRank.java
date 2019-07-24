package codewars;

import java.util.ArrayList;
import java.util.List;

public class maxDifferenceHackerRank {

    public static int maxDiff(List<Integer> arr) {
        int difference = 0;
        int result = 0;
        List<Integer> results = new ArrayList<>();

        int size = arr.get(0);


        if(arr.get(2) > arr.get(1)) {
            difference = arr.get(2) - arr.get(1);
            results.add(difference);
        }

        for(int i=size;i>3;i--) {
            if(arr.get(i-1) < arr.get(i)) {
                difference = arr.get(i) - arr.get(i-1);
                results.add(difference);
            }
        }
        System.out.println(results);

        return result;
    }


    public static void main(String[] args) {
        List<Integer> di = new ArrayList<>();
        di.add(4);
        di.add(1);
        di.add(2);
        di.add(6);
        di.add(4);
        maxDiff(di);
    }
}
