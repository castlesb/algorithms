/**
 * 
 */
package list;

/**
 * @author briancastles
 * 
 * Doubly Linked List implementation.
 *
 */
public class DoublyLinkedList<T> {
	
	private DLLNode<T> head;
	private DLLNode<T> tail;

	private class DLLNode<T> implements Comparable<T> {

		private T value;
		private DLLNode<T> next;
		private DLLNode<T> prev;
		
		@Override
		public int compareTo(T arg) {
			if(arg == this.value)
				return 0;
			return 1;
		}
	}
	
	public void add(T element) {
		DLLNode<T> newNode = new DLLNode<T>();
		newNode.value = element;
		
		if(head == null) {
			addFirst(newNode);
		}else{
			newNode.next = null;
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}	
	}
	
	public void addAfter(T element, T after) {
		DLLNode<T> temp = find(after);
		DLLNode<T> newNode = new DLLNode<T>();
		newNode.value = element;
		
		if(temp == null){
			System.out.println("Sorry, could not find " + element + " ...");
			return;
		}
		
		if(temp == tail) {
			addLast(newNode);
		}else{
			newNode.next = temp.next;
			temp.next.prev = newNode;
			newNode.prev = temp;
			temp.next = newNode;
		}
		
	}
	
	public void addFirst(DLLNode<T> newNode) {
		head = newNode;
		tail = newNode;
		newNode.next = null;
		newNode.prev = null;
	}
	
	public void addLast(DLLNode<T> newNode) {
		newNode.next = null;
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
	}
	
	public void delete(T element) {
		DLLNode<T> node = find(element);
		
		if(node == null){
			System.out.println("Sorry, could not find " + element + " ...");
			return;
		}
		
		if(node == head){
			deleteFirst();
			return;
		}
		
		if(node == tail){
			deleteLast();
			return;
		}
		
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	
	public void deleteFirst() {
		head = head.next;
		head.prev = null;
		
		if(head == null)
			tail = null;
	}
	
	public void deleteLast() {
		tail = tail.prev;
		tail.next = null;
	}
	
	public DLLNode<T> find (T after) {
		DLLNode<T> temp;
		
		for(temp = head; temp != null; temp = temp.next){
			if(temp.compareTo(after) == 0)
				return temp;
		}
		return null;
	}
	
	
	public void printList() {
		DLLNode<T> temp;
		for(temp = head; temp != null; temp = temp.next){
			System.out.println(temp.value);
		}
	}
}
