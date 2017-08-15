public class Node {
    public String data;
    public Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

	public Node getNext() {
		return this.next;
	}
	   public String getValue(){
	    	return this.data;
	    }
	   public void setNext(Node next)
       {
           this.next = next;
       }

}
