import java.util.Scanner;

public class FredoAndUpdateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 int N = in.nextInt();
	        int[] arr = new int[N];
	        long sum = 0;
	        for (int i = 0; i < N; i++) {
	          arr[i] = in.nextInt();  
	          sum += arr[i];
	        }
	        System.out.println( sum / N + 1);
	    }
	}