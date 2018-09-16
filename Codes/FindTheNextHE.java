import java.util.Scanner;

public class FindTheNextHE {
	
	private static void calculate(int[] a, int q) {
		q=q+1;
		for(int i=0;i<a.length;i++){
			if(a[i] == q){
				q=q+1;
			}
		}
		System.out.println(q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int query = in.nextInt();
		int a[] = new int[len];
		
		
		for(int i=0;i<len;i++){
			a[i] = in.nextInt();
		}
		for(int i=0;i<query;i++){
		int q1 = in.nextInt();
		calculate(a, q1);
		}
		
	}

	
}
