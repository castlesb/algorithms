/**
 * 
 */
package stack;

import java.util.EmptyStackException;
import java.util.List;

/**
 * @author briancastles
 *
 * Implement stack with a linked list.
 * 
 * 
 */
public class LinkedStack<T> {
	
	private static class LinkedStackNode<T> {
		
		/** The reference to the data */
		private T data;
		/** The reference to the next Node */
		private LinkedStackNode<T> next;
		
		/** Constructor creates a new node with a null next field. */
		private LinkedStackNode(T data) {
			this.data = data;
		}
		
		/** Constructor creates a new node that references another node in next field. */
		private LinkedStackNode (T data, LinkedStackNode<T> next) {
			this.data = data;
			this.next = next;
		}
	}

	/** The reference to the top of the stack. */
	private LinkedStackNode<T> head = null;
	
	/** Pushes an item onto the top of the stack */
	public void push (T obj) {
		head = new LinkedStackNode<T>(obj, head);
	}
	
	/** Returns the item to be popped then pops 
	 * the item from the top of the stack */
	public T pop() {
		if(isEmpty())
			throw new EmptyStackException();
		
		T temp = head.data;
		head = head.next;
		return temp;

	}
	
	/** Returns the item at the top of the stack. */
	public T peek() {
		
		if(isEmpty())
			throw new EmptyStackException();
		
		return head.data;
	}
		
	/** Returns true if the stack is empty; otherwise, returns false. */
	public boolean isEmpty () {
		return head == null;
	}
	
	/** Display the data at the top of the stack. */
	public void displayStack() {
		LinkedStackNode<T> temp;
		for(temp = head; temp != null; temp = temp.next)
		System.out.println(temp.data);
	}
}
