
import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest {

    private ReverseLinkedList testClass;
    private LinkedList        list;

    @Before
    public void setUp() {

        testClass = new ReverseLinkedList();
        list = new LinkedList();
        init();
    }

    @Test
    public void testName() {

        testClass.reverseLinkedList(list);

        Node current = list.head;
        while (current != null) {

            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }

    private void init() {

        list.insert("1");
        list.insert("2");
        list.insert("3");
        list.insert("4");
        list.insert("5");
        //list.insert("6");
        //list.insert("7");
        //list.insert("8");
    }

}