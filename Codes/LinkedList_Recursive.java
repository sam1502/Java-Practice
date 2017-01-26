// Recursive Java program to count number of nodes in 
// a linked list

class Node
{
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
class LinkedList_Recursive
{
    Node head;
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public int getCountRec(Node node)
    {
        if (node == null)
            return 0;
        return 1 + getCountRec(node.next);
    }
    public int getCount()
    {
        return getCountRec(head);
    }
    public static void main(String[] args)
    {

        LinkedList_Recursive lList = new LinkedList_Recursive();
        lList.push(1);
        lList.push(3);
        lList.push(1);
        lList.push(2);
        lList.push(1);
        lList.push(5);
 
        System.out.println("Count of nodes is " +
                           lList.getCount());
    }
}