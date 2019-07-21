/**
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
 * <p>
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * <p>
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 */

package codewars;

public class YourOrderPlease {

    public static String order(String words) {

        String[] word = words.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= word.length; i++) {

            for (String str : word) {
                if (str.contains(Integer.toString(i))) sb.append(str).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
