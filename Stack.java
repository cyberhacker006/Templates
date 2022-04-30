
public class Stack {
	private int top;
	private Object[] elements;
	Stack(int capacity){
		elements = new Object[capacity];
		top--;
	}
	void push(Object data) {
		if(isFull())
			System.out.println("Stack Overflow");
		else {
			top++;
			elements[top] = data;
		}
	}
	Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		else {
			Object retData = elements[top];
			top--;
			return retData;
		}
	}
	int size() {
		return top + 1;
	}
	Object peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		else
			return elements[top];
	}
	boolean isFull() {
		if(elements.length == (top + 1))
			return true;
		else
		    return false;
	}
	boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}

}
