/**
 * Given a string of words, you need to find the highest scoring word.
 * <p>
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * You need to return the highest scoring word as a string.
 * <p>
 * If two words score the same, return the word that appears earliest in the original string.
 * All letters will be lowercase and all inputs will be valid.
 */


package codewars;

public class HighestScoringWord {

    public static String high(String s) {

        String[] words = s.split(" ");
        int highestScore = 0;
        String finalWord = "";

        for (String str : words) {
            int score = 0;
            for (char c : str.toCharArray()) {
                score += c - 'a' + 1;
            }

            if (score > highestScore) {
                finalWord = str;
                highestScore = score;
            }
        }

        return finalWord;
    }

    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud txai"));
        System.out.println(high("what time are we climbing up to the volcano"));
        System.out.println(high("take me to semynak"));
    }
}
