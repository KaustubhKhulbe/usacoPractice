package Not_USACO.Miscellaneous.linkedList1;

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
	
	public void insertAtEnd(int id, double value) {
		Link link = new Link(id, value);
		
		if(first == null) {
			first = link;
			return;
		}
		
		Link current = first;
		while(current.next != null) current = current.next;
		current.next = link;
	}
	
	public Link removeFirst() {
		Link temp = first;
		if(first != null) first = first.next;
		return temp;
	}
	
	public Link remove(int id) {
		Link current = first;
		Link previous = null;
		
		while(current.id != id) {
			previous = current;
			current = current.next;
			if(current == null) return null;
		}
		
		if(previous == null) first = first.next;
		else current.next = previous.next;
		return current;
		
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
