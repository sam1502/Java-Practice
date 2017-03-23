
public class add2LargeNumbers {
	
	public void addLargeNumbers(String num1, String num2){
		
		int min = (num1.length() < num2.length() ? num1.length() : num2.length());
		int max = (num1.length() < num2.length() ? num2.length() : num1.length());
		
		int n1[] = new int[max];
		int n2[] = new int[max];
		
		System.out.println("Max is: "+max + "Min is : "+min);
		
		for(int i=0;i<num1.length();i++){
			n1[i] = num1.charAt(num1.length() -1-i)-48;
		}
		System.out.println(num1);
		
		for(int i=0;i<num2.length();i++){
			n2[i] = num2.charAt(num2.length()-1-i)-48;
		}
		System.out.println(num2);
		
		int carry = 0, k=0;
		int sum[] = new int[max+1];
		
		for(k=0;k<max;k++){
			sum[k] = (n1[k] + n2[k] + carry) % 10;
			if(n1[k]+n2[k]+carry >= 10){
				carry = 1;
			}
			else
				carry = 0;
		}
		
		sum[max] = carry;
		System.out.println("\n");
		//String result;
		for(int j = max; j>=0;j--){
			System.out.print(sum[j]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add2LargeNumbers obj = new add2LargeNumbers();
		obj.addLargeNumbers("111111111111", "22222222222222");

	}

}
