import java.util.Scanner;

public class PairRecoveryHE {
	
	public static void calculate(int a3, int a4)
	{
		int a1,a2 = 0;
		int temp = a4-a3;
		a2 = temp;
		int temp1 = a3-a2;
		a1 = temp1;
		
		System.out.println(a1 +" "+a2);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a3 = in.nextInt();
		int a4 = in.nextInt();
		
		calculate(a3,a4);

	}

}
