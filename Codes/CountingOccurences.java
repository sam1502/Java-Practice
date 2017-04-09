//Counting the occurrence of each character in string.
//Convert the given string to char array and iterate through it.

import java.util.Scanner;

public class CountingOccurences {

public static void main(String[] args) {

	int count=0;
    Scanner inp= new Scanner(System.in);
    System.out.println("Enter the String");   
    String str = inp.nextLine();
    System.out.println("analyze "+str);
    char c[] = str.toCharArray();
    inp.close();
    for(int i=0;i<str.length();i++){
    	count=0;
    	for(int j=0;j<str.length();j++){
    	
    		if(j<i && c[i]==c[j]){
    			break;
    			
    		}
    		if(c[j]==c[i]){
    			count++;
    			
    		}
    		if(j==str.length()-1){
    			System.out.println(" "+c[i] +": "+ count);
    		}
    	}
    	
    }
    
    
	}
}