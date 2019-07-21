package codewars;

public class FindTheMissingLetter {

    public static char findMissingLetter(char[] array) {

        char letter = 'a';

        for(int i= 0; i< array.length;i++) {
            if(array[i+1] - array[i] != 1) {
                char b = array[i];
                int letterValue  = b + 1;
                letter = (char) letterValue;
                break;
            }
        }
        return letter;
    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
