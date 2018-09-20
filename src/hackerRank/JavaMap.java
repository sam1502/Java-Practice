package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String,Integer> phonebook = new HashMap<>();
		System.out.println("entries");
		int entries = in.nextInt();
		in.nextLine();
		for(int i=0;i<entries;i++){
			String name = in.nextLine();
			int num = in.nextInt();
			phonebook.put(name, num);
			in.nextLine();
		}
		
		while(in.hasNext()){
			String n = in.nextLine();
			try{
				int temp = phonebook.get(n);
				System.out.println(n+" = "+temp);
			}
			catch(Exception e){
				System.out.println("Not found");
			}
		}

	}

}
