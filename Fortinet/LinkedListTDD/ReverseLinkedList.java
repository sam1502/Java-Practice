

public class ReverseLinkedList{
public void reverse(LinkedList list) {
	Node prev = null;
    Node current = null;
    Node next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    current = prev;
   
}
}