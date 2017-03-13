import java.util.Scanner;

public class UniqueEle_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, flag=0,count=0;
		System.out.println("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements of Array:");
		int a[] = new int[n];
		for(int i=0; i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Uniques elements in Array are: ");
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i] == a[j]){
					a[i] = -1;
				}
			}
		}
		
		System.out.println("The Final array is: ");
		for(int i=0;i<n;i++){
			if(a[i] != -1){
				System.out.println(a[i]+ " ");
			}
		}
	}
}