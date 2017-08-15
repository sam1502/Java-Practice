import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest {
	
	private  ReverseLinkedList testClass;
	private LinkedList list;
	
	@Before
	public void setUp() {
		
		testClass = new ReverseLinkedList();
		//list = new LinkedList();
		init();
	}
	
	@Test
	public void reverse() {
		testClass.reverse(list);
		
		Node current = list.head;
		while(current != null){
			System.out.print(current.data + "---> ");
			current = current.next;
		}
	}
	
	public void init(){
		list = new LinkedList("1");
		//list.insert("2");
		//list.insert("3");
		//list.insert("3");
		//list.insert("4");
		
	}

}