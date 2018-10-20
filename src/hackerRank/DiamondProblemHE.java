package hackerRank;

import java.util.Scanner;

public class DiamondProblemHE {
		  static Scanner sc = new Scanner(System.in);
			public static void main(String[] args) {
				int tc = sc.nextInt();
				while(tc-->0){
					long height = sc.nextLong();
					long width = sc.nextLong();
					long ia = height*width;
					long total = 0;
					total += (height/4)*(width/2);
					if(width%2==0){
						if(height%4 ==0 || height%4==1){
							total += ((height/4 )-1)*((width-2)/2);
						}else{
							total += ((height/4))*((width-2)/2);
						}
					}else{
						if(height%4 ==0 || height%4==1){
							total += ((height/4 )-1)*((width-1)/2);
						}else{
							total += ((height/4))*((width-1)/2);
						}
					}
					System.out.println(ia-(total*4));
		 
				}
			}
		 
		}