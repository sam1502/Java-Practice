//not done :(

package careercup;

public class ReorderArray {

    public static int reorder(int[] arr) {

        int oddI = 0;
        int evenI = 0;
        int count = 0;

            if (evenI < arr.length && (arr[evenI] % 2 == 0)) {
                evenI = evenI + 2;
            }

            if (oddI < arr.length && (arr[oddI] % 2 == 1)) {
                oddI = oddI + 2;
            }

            if (evenI < arr.length && oddI < arr.length) {
                count++;
                int temp = arr[evenI];
                arr[evenI] = arr[oddI];
                arr[oddI] = temp;
            }

            for(int a : arr) {
                System.out.println(a);
            }
        //System.out.println(count);
        return 5;

    }


    public static void main(String[] args) {
        reorder(new int[]{2, 1, 3, 4});
    }
}
