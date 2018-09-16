
public class testcommit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello i'm lOOking for a Java Developer Position.";
		s.toLowerCase();
		char[] c = s.toCharArray();
		
		
		for(int i=0;i<c.length;i++){
			int count  = 0;
			for(int j=0;j<c.length;j++){
				if(c[i] == c[j]){
					count++;
					
				}
				if(j == s.length()-1){
					System.out.println(c[i] + " "+ count);
				}
				
			}
			
		}

	}

}
