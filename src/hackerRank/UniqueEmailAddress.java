package hackerRank;


/*
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 * Discard everything after the + sign and do not consider .
 * "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  
 * 
 * Given a list of emails, we send one email to each address in the list.
 * How many different addresses actually receive mails? 
 * 
 */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueEmailAddress {
	
	
	public static int check(String[] emails){
		Set<String> res = new HashSet<>();
		for (String email : emails) {
            String localName = email.split("@")[0];
            String domainName = email.split("@")[1];

            localName = localName.replace(".", "");
            int index = localName.indexOf('+');
            if (index != -1) {
                localName = localName.substring(0, index);
            }

            res.add(localName+"@"+domainName);
        }

        return res.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String emails[] = new String[n];
		
		for(int i=0;i<n;i++){
			emails[i] = in.next();
		}
		
		System.out.println(check(emails));
		in.close();
	}

}
