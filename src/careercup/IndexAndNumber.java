/**
 * Print number that matches with the index in non-duplicate array
 */

package careercup;

public class IndexAndNumber {


    public static void print(Integer[] arr) {


        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }

      /*  List<Integer> strings = new ArrayList<>(Arrays.asList(arr));
        strings.stream()
                .collect(HashMap::new, (h, o) -> h.put(h.size(), o), (h, o) -> {})
                .forEach((i, o) -> {
                    System.out.println(String.format("%d => %s", i, o));
                });
    }*/


    public static void main(String[] args) {

        Integer[] a = {0, 1, 20, 3, 40, 5};

        print(a);
    }
}
