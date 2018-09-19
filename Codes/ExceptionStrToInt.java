import java.util.Scanner;

public class ExceptionStrToInt {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		try{
		int a = Integer.parseInt(s);
		System.out.println(a);
		}
		catch(Exception ex){
			System.out.println("Bad String");
		}

	}

}
