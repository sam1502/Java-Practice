
public class Stack_arrays {
	static final int max = 1000;
	int top;
	int a[] = new int[max];
	boolean isEmpty(){
		return (top<0);
	}
	
	boolean push(int x){
		if(top >= max){
			System.out.println("Stack Overflow");
			return false;
		}
		else{
			a[++top] = x;
			return true;
		}
	}
	
	int pop(){
		if(top < 0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int x = a[top--];
			return x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_arrays s = new Stack_arrays();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.pop() + " Popped from Stack");

	}

}
