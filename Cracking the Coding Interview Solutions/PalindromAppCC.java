//Take number from the user, reverse it and add it to itself. 
//If the sum is not a palindrome then repeat the procedure until you get a palindrome.

//7325 (Input Number) + 5237 (Reverse Of Input Number) = 12562
//12562 + 26521 = 39083
//39083 + 38093 = 77176
//77176 + 67177 = 144353
//144353 + 353441 = 497794 (Palindrome)


import java.util.Scanner;
 
public class PalindromAppCC
{
    //Method To Reverse A Number
	public static int reverseNum(int number)
	{
		int reverse = 0;
		int rem = 0;
		while(number != 0){
			rem = number % 10;
			reverse = (reverse * 10) + rem;
			number = number / 10;
		}
		return reverse;
	}
	//check if number is palindrome or not.
	public static boolean isPalindrome(int number)
	{
		int reverse = reverseNum(number);
		if(number == reverse)
		{
			return true;
		}
		else
			return false;
	}
	//method to reverse and add the number and reverse.
	public static void reverseAndAdd(int number)
	{
		if(isPalindrome(number)){
			System.out.println("Number is already a Palindrome!");
		}
		while(!isPalindrome(number)){
			int reverse = reverseNum(number);
			int sum = number + reverse;
			System.out.println(+number +" + " +reverse +" = " +sum);
			number = sum;
		}
	}
     
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter Number : ");
         
        int inputNumber = sc.nextInt();
         
        reverseAndAdd(inputNumber);
    }
}