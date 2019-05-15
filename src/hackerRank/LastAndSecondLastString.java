//Given the string print the last two characters reversed and with a space between them.
//ex : bat output: t a



package hackerRank;

import java.util.Scanner;

public class LastAndSecondLastString {



    public static String lastLetters(String word) {

        String substring = word.length() > 2 ? word.substring(word.length() - 2) : word;
        System.out.println(substring);

        char[] a = substring.toCharArray();
        substring = a[1] + " " +a[0];

        return substring;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        lastLetters(s);
    }


}
