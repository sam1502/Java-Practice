public class LinkedList_2 {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insertAfter(Node prev_node, int new_data){
		if(prev_node == null){
			System.out.println("The Given Previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	public void append(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next!=null)
			last = last.next;
		last.next = new_node;
		return;
	}
	
	public void printList(){
		Node tnode = head;
		while(tnode!=null){
			System.out.println(tnode.data+" ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_2 lList = new LinkedList_2();
		lList.append(6);
		lList.push(7);
		lList.push(1);
		lList.append(4);
		
		lList.insertAfter(lList.head.next, 8);
		System.out.println("\n Created Linked List is : ");
		lList.printList();
	}

}
