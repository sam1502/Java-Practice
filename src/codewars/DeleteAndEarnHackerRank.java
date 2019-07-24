package codewars;

import java.util.Arrays;
import java.util.HashMap;

public class DeleteAndEarnHackerRank {


    public static int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return nums[0];

        // sum and hash
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + num);
            } else
                numMap.put(num, num);
        }

        // sorted num
        Integer[] uniqueNums = new Integer[numMap.size()];
        uniqueNums = numMap.keySet().toArray(uniqueNums);
        Arrays.sort(uniqueNums);


        int prevSum = 0;
        int prevLSum = 0;
        for (int i = 0; i < uniqueNums.length; i++) {
            int temp = 0;
            if (i - 1 >= 0 && uniqueNums[i - 1] == uniqueNums[i] - 1) {
                temp = Math.max(prevLSum + numMap.get(uniqueNums[i]), prevLSum);
            } else {
                temp = prevSum + numMap.get(uniqueNums[i]);
            }

            prevLSum = prevSum;
            prevSum = temp;
        }

        return prevSum;
    }

    public static void main(String[] args) {
        //int[] arr = {3, 4, 2};
        int[] arr = {5, 6, 6, 4, 11};

        System.out.println(deleteAndEarn(arr));
    }

}