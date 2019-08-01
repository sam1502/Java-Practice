/**
 * Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James.
 * Since James doesn't know how to make this happen, he needs your help.
 *
 * Task
 * You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
 * Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 *
 * Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 *
 */



package codewars;

public class GiveMeADiamond {

    public static String print(int n) {
        if (n % 2 == 0 || n <= 0) return null;
        StringBuffer sb = new StringBuffer();
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.abs(mid - i); j++) {
                sb.append(" ");
            }
            if (i <= mid) {
                for (int j = 1; j <= 2 * i - 1; j++)
                    sb.append("*");
            } else {
                for (int j = 1; j <= 2 * (2 * mid - i) - 1; j++)
                    sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(print(5));
    }
}
