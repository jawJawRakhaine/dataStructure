package DataStructure;

public class Stack {
	
	public int top = -1;
	public int stackSize = 10;
	public int []stackArray = new int [stackSize];
	
	public static void main(String[] args) {

		Stack stack = new Stack();
		
		stack.push(2);
		stack.push(1);
		stack.push(20);
		stack.display();
		stack.pop();
		stack.display();
		stack.peek();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(1000);
		stack.display();
		stack.peek();
		stack.peek();
		stack.pop();
		
	}
	
	public void push(int value) {
		if (top>=stackSize-1) {
			System.out.println("Stack is overflow! You can't push any value");
		}else {
			System.out.println("PUSH: "+value);
			stackArray[++top] = value;
		}
	}

	public void peek() {
		if (top<0) {
			System.out.println("Stack underflow! You can't print top value from stack");
		}else {
			System.out.println("TOP: "+stackArray[top]);
		}
	}
	
	public void pop() {
		if (top<0) {
			System.out.println("Stack underflow! You can't pop any value from stack");
		}else {
			System.out.println("POP "+stackArray[top]+" from stack.");
			top--;
		}
	}
	
	public void display() {
		for (int i = top; i>=0; i--) {
			System.out.println("Stack["+i+"] = "+stackArray[i]);
		}
	}
}
