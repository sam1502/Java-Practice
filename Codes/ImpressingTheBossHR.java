import java.util.Scanner;

public class ImpressingTheBossHR {
	
	public static String canModify(int[] a){
		int count = 0;
		int i=0;
		if(a.length == 0){
			return "NO";
		}
		while(i<a.length-1){
			for(int j=1;j<a.length;j++){
				if(a[j] < a[i]){
					count++;
				}
				i++;
			}
		}
			if(count >= 2){
				return "NO";
			}
			return "YES";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int l = in.nextInt();
		int arr[] = new int[l];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<l;i++){
			arr[i] = in.nextInt();
		}*/
		//int arr[] = {5,7,7,11,15,12,22,24};
		int arr[] = {20,19,18,16,14,15,14,13,11};
		
		System.out.println(canModify(arr));
	}

}
