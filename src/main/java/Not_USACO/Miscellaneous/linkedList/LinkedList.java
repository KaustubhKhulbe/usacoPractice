package Not_USACO.Miscellaneous.linkedList;

public class LinkedList {

	private Link first;
	
	public LinkedList() {
		
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertAtBegining(int id, double value) {
		Link link = new Link(id, value);
		link.next = first;
		first = link;
	}
	
	public int size() {
		int count = 0;
		Link current = first;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void printAll() {
		Link current = first;
		
		while(current != null) {
			System.out.println(current + " ");
			current = current.next;
		}
	}

}
