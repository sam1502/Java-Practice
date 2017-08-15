public class ReverseLinkedList {

    public void reverseLinkedList(LinkedList list) {

        boolean firstReverse = true;
        Node prev = null;
        Node current = null;
        Node next = null;

        prev = list.head;
        current = prev.next;
        next = current.next;

        while (next != null) {

            current.next = prev;
            if (firstReverse) {

                prev.next = null;
                firstReverse = false;
            }

            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        list.head = current;
    }

}