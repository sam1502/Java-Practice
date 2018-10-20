package hackerRank;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


class Node{
	int data;
	Node next;
	
	public Node(int d) {
		data = d;
		next = null;
	}
}


public class AddTwoNumbers {
	static Node head;
	public static void push(int new_data){
		Node newData = new Node(new_data);
		newData.next = head;
		head = newData;
	}
	
	
	public static void getCount(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		List<Integer> first = new LinkedList<>();
		List<Integer> second = new LinkedList<>();
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int len = in.nextInt();
		for(int i=0;i<len;i++){
			push(in.nextInt());
		}
		getCount();
		
		

	}

}
