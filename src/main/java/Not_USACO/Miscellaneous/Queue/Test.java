package Not_USACO.Miscellaneous.Queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue(10);
		queue.enqueue("aaa");
		queue.enqueue("bbb");
		queue.enqueue("ccc");
		queue.enqueue("ddd");
		queue.enqueue("eee");
		queue.enqueue("fff");
		queue.enqueue("ggg");
		queue.printAll();
	
		while(!queue.isEmpty()) {
			queue.dequeue();
			queue.printAll();
		}

	}

}
