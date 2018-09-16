import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int board[][] = new int[256][256];
		for(int i=0;i<=255;i++){
			for(int j=0;j<=255;j++){
				board[i][j] = 0;
			}
		}
		
		
		while(in.hasNext()){
			String line = in.nextLine();
			String elements[] = line.split("\\s");
			String command = elements[0];
			int target  = Integer.parseInt(elements[1]);
			int value = 0;
			
			
			if(command.equalsIgnoreCase("setrow")){
				value = Integer.parseInt(elements[2]);
				for(int i=0;i<256;i++){
					board[target][i] = value;
				}
			}
			
			if(command.equalsIgnoreCase("setcol")){
				value = Integer.parseInt(elements[2]);
				for(int i=0;i<256;i++){
					board[i][target] = value;
				}
			}
				
				
			if(command.equalsIgnoreCase("querycol")){
				int total = 0;
				for(int i=0;i<256;i++){
					total += board[i][target];
				}
				System.out.println(total);
		}
			
			if(command.equalsIgnoreCase("queryrow")){
				int total = 0;
				for(int i=0;i<256;i++){
					total += board[target][i];
				}
				System.out.println(total);
		}
		}
	}
}

