package hackerRank;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzzHR {


    private static void fizzBuzz(int num) {
        IntStream.rangeClosed(1, num)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "HelloWorld" : "Hello") : (i % 7 == 0 ? "World" : i))
                .forEach(System.out::println);
    }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fizzBuzz(n);

    }
}
