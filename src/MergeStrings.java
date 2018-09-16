
public class MergeStrings {
	
	
	public static String mergeStrings(String s1, String s2){
		String mergedString = "";
		    for(int i=0;i<s1.length();i++){
		        mergedString=mergedString+s1.charAt(i) + s2.charAt(i);      
		    }
		    if(s1.length()<s2.length()){
		        mergedString=mergedString+s2.substring(s1.length());
		    }
		    return mergedString;
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abc";
		String s2 = "stuvwx";
		
		System.out.println(mergeStrings(s1,s2));

	}

}
