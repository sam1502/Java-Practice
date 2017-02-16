//Set Example.
import java.util.*;

public class Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[] = {1,3,6,8,16,22};
		Set<Integer> set = new HashSet<Integer>();
		try{
			for(int i=0;i<count.length;i++){
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			System.out.println("Sorted set is: ");
			System.out.println(sortedSet);
			
			System.out.println("The First Element of the Set is :"+sortedSet.first());
			System.out.println("The Last Element of the Set is : "+sortedSet.last());
		}
		catch (Exception e){}

	}

}
