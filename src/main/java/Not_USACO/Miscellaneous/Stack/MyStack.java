package Not_USACO.Miscellaneous.Stack;

public class MyStack {

	
	private Object[] elements;
	private int top;
	
	public MyStack(int size) {
		elements = new Object[size];
		top = -1;
	}
	
	public void push(Object ref) {
		/*if(top == elements.length - 1) {
			Object[] elements2 = new Object[elements.length * 2];
			for(int i = 0; i < elements.length ;i++) {
				elements2[i] = elements[i];
				elements = elements2;
			}
		}*/
		if(top == elements.length - 1) throw new IndexOutOfBoundsException();
		elements[++top] = ref;
	}
	
	public Object pop() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		return elements[top--];
	}
	
	public Object peek() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		return elements[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
}
