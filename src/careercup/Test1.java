package careercup;

public class Test1 {


    public static String foo(String s) {

        char[] chars = s.toCharArray();
        int right = chars.length - 1;
        for (int left = 0; left < right; left++) {
            char swap = chars[left];
            chars[left] = chars[right];
            chars[right--] = swap;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(foo("hello world"));
    }


}
