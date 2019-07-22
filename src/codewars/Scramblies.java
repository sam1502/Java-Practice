/**
 * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 *
 * Notes:
 *
 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered
 */


package codewars;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {
            str2 = str2.replaceFirst("" + str1.charAt(i), "");
            if (str2.isEmpty()) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
        System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(scramble("katas", "steak"));
        System.out.println(scramble("scriptjavx", "javascript"));
        System.out.println(scramble("scriptingjava", "javascript"));
        System.out.println(scramble("scriptsjava", "javascripts"));
        System.out.println(scramble("javscripts", "javascript"));
        System.out.println(scramble("aabbcamaomsccdd", "commas"));
        System.out.println(scramble("commas", "commas"));
        System.out.println(scramble("sammoc", "commas"));
    }
}
