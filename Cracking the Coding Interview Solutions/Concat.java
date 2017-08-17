
public class Concat {
	
	public static void addArray(int a[],int b[]){
		int len = a.length;
		int len1 = b.length;
		int count =0;
		int[] c = new int[len+len1];
		
		for(int i=0;i<a.length;i++){
			c[i] = a[i];
			count++;
		}
		//System.out.println(count);
		
		for(int j=0;j<b.length;j++){
			c[count++] = b[j];
		}
		for(int i=0;i<c.length;i++){
		System.out.println(c[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		addArray(a,b);
		
		
	}

}
