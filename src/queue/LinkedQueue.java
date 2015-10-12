/**
 * 
 */
package queue;

/**
 * @author briancastles
 *
 */
public class LinkedQueue<T> {
	
	private Node head;
	private Node tail;
	private int size;
	
	private class Node {
		private T item;
		private Node next;
		
		private Node(T item) {
			this.item = item;
		}
	}
	
	protected boolean isEmpty() {
		return (size == 0);
	}
	
	protected void enqueue(T item) {
		Node node = new Node(item);
		
		if(isEmpty()){
			head = node;
			tail = node;
		}else{
			tail.next = node;
			tail = node;
		}		
		size++;
	}
	
	protected T dequeue() {
		if(isEmpty())
			throw new RuntimeException("Queue underflow");
		
		T item = head.item;
		head = head.next;
		size--;
		
		if(isEmpty())
			tail = null;
		
		return item;
	}
	
	protected T peek() {
		if (isEmpty())
			throw new RuntimeException("Queue underflow");
		
		return head.item;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
        for (Node node = head; node != null; node = node.next) {
            s.append(node.item + " ");
        }
        return "\nHead: " + head.item + " Tail: " + tail.item + " Size: " + size + "\n" + s.toString();
	}
}
