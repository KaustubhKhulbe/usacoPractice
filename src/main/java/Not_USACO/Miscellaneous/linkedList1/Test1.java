package Not_USACO.Miscellaneous.linkedList1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		//System.out.println(list.size());
		list.insertAtBegining(1, 1.1);
		list.insertAtBegining(2, 2.2);
		list.insertAtBegining(3, 3.3);
		
		list.insertAtEnd(4, 4.4);
		list.insertAtEnd(5, 5.5);
		list.insertAtEnd(6, 6.6);
		
		list.removeFirst();
		list.removeFirst();
		
		list.printAll();
	}	

}
