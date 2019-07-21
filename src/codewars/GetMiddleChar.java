/**
 * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character.
 * If the word's length is even, return the middle 2 characters.
 */


package codewars;

public class GetMiddleChar {

    public static String getMiddle(String word) {

        int a;
        if (word.length() == 1 || word.length() == 2) {
            return word;
        }

        if (word.length() % 2 == 0) {
            return word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
        } else {
            a = (int) Math.ceil(word.length() / 2);
            return word.substring(a, a+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("A"));
        System.out.println(getMiddle("middle"));
    }
}
