import java.util.Scanner;

public class CommonDivisorHE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		int count = 0;
		if(a>b){
	        //int count =0;
	        for(int i =1;i<=a;i++){
	            if(a%i == 0 && b%i == 0){
	                count++;
	            }
	        }
	    }else if(a<b){
	        //int count =0;
	        for(int i=1;i<=b;i++){
	            if(a%i == 0 && b%i == 0){
	                count++;
	                
	            }
	            
	        }
	        System.out.println(count);
	    }
	}
}
