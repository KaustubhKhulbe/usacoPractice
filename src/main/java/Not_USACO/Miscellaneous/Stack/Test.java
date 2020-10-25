package Not_USACO.Miscellaneous.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack(5);
		
		stack.push("AAAA");
		stack.push("BBBB");
		stack.push("CCCC");
		stack.push("DDDD");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		retrieveAll(stack);

	}
	
	public static void retrieveAll(MyStack stack) {
		MyStack s = new MyStack(10);
		while(!stack.isEmpty()) {
			s.push(stack.pop());
		}
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
	}

}
