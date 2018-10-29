package hackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QuestionPaperOCT18HE {
	
	public static void calculate(int noOfQues,int corrMark,int wrongMarks){
		Set<Integer> marks = new HashSet<>();
		int corrcTot = 0;
		int wrongTotal = 0;
		marks.add(0);
		for(int i=0;i<noOfQues;i++){
			corrcTot += corrMark;
			wrongTotal += (-wrongMarks);
			marks.add(corrcTot);
			marks.add(wrongTotal);
		}
		
		System.out.println(marks);
		System.out.println(marks.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		
		for(int i=0;i<testCases;i++){
		int noOfQues = in.nextInt();
		int corrMark = in.nextInt();
		int wrongMarks = in.nextInt();
		
		calculate(noOfQues,corrMark,wrongMarks);
		}
	}

}
