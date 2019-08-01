/**
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more capitals letters.
 * The 1st letter of a code is the capital letter of the book category. In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.
 *
 * For example an extract of one of the stocklists could be:
 *
 * L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
 *  M = {"A", "B", "C", "W"}
 *
 *
 *  output:
 *  (A : 20) - (B : 114) - (C : 50) - (W : 0)
 */

package codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HelptheBookSeller {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> result = new HashMap<>();

        for (String s : lstOfArt) {
            String[] splitRes = s.split(" ");

            String s1 = splitRes[0];

            for (String x : lstOf1stLetter) {
                if (x.equalsIgnoreCase(String.valueOf(s1.toCharArray()[0]))) {

                    if (result.containsKey(String.valueOf(s1.toCharArray()[0]))) {
                        result.put(String.valueOf(s1.toCharArray()[0]), result.get(String.valueOf(s1.toCharArray()[0])) + Integer.valueOf(splitRes[1]));
                    } else {
                        result.put((String.valueOf(s1.toCharArray()[0])), Integer.valueOf(splitRes[1]));
                    }
                }
            }
        }
        String content = result.entrySet()
                .stream()
                .map(e ->  "("+e.getKey() + " : " + e.getValue() + ")")
                .collect(Collectors.joining("-"));

        // your code here
        return content;
    }


    public static void main(String[] args) {
        String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = {"A", "B" ,"E"};
        System.out.println(stockSummary(art, cd));
    }
}
