/**
 * Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it.
 * If the two numbers are equal return a or b.
 *
 * Note: a and b are not ordered!
 */



package codewars;

public class SumOfNumbers {

    public static int getSum(int a , int b) {
        int result = 0;

        if(a == b ){
            return a;
        }

        if(a > b) {
            for(int i= b ; i<=a; i++) {
                result = result+i;
            }
        }else {
            for(int i=a;i<=b;i++){
                result = result+i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getSum(0,-1));
        System.out.println(getSum(0,1));
        System.out.println(getSum(1,2));
        System.out.println(getSum(0,1));
        System.out.println(getSum(1,1));
        System.out.println(getSum(-1,0));
        System.out.println(getSum(-1,2));
    }
}
