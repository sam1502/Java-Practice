package hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class GatesHE {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		   
        int n=Integer.parseInt(br.readLine());
        while(n>0){
        	n--;
        	int d=Integer.parseInt(br.readLine());
        	double r=(double)1/d;
        	r=(double)1-r;
        	DecimalFormat numberFormat = new DecimalFormat("0.000000");
        	//numberFormat.setRoundingMode(RoundingMode.FLOOR);
        	System.out.println(numberFormat.format(r));
        }
}

}