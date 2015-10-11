/**
 * 
 */
package list;
/**
 * @author briancastles
 *
 * Singly Linked List implementation.
 */
public class SinglyLinkedList<T> {
	
	private SLLNode<T> head;
	private SLLNode<T> tail;
	
	public void add(T element) {
		SLLNode<T> newNode = new SLLNode<T>();
		newNode.setValue(element);
		
		if(head == null){
			head = newNode;
			tail = newNode;
		}else{
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public void addAfter(T element, T after) {
		SLLNode<T> temp = find(after);
		
		if(temp == null){
			System.out.println("Sorry, could not find " + after + " ...");
			return;
		}
		
		SLLNode<T> newNode = new SLLNode<T>();
		newNode.setValue(element);
		
		newNode.setNext(temp.getNext());
		
		if(temp == tail)
			tail = newNode;
		
		temp.setNext(newNode);
	}
	
	public void delete(T element) {
		SLLNode<T> temp = find(element);
		
		if(temp == null)
			System.out.println("Sorry, could not find " + element + " ...");
		
		if(temp == head)
			deleteFirst();
		
		if(temp == tail){
			deleteLast();
		}
		
		SLLNode<T> i = head;
		SLLNode<T> j = i;
		
		while(i.getNext() != temp){
			j = i;
			i = i.getNext();
		}
		
		j.setNext(temp.getNext());
		
	}
	
	public void deleteFirst() {
		head = head.getNext();
		if(head == null)
			tail = null;
	}
	
	public void deleteLast() {
		SLLNode<T> i = head;
		SLLNode<T> j = i;
		
		while(i.getNext() != null){
			j = i;
			i = i.getNext();
		}
		tail = j;
		j.setNext(null);
	}
	
	public SLLNode<T> find(T after) {
		SLLNode<T> temp;
		for(temp = head; temp != null; temp = temp.getNext()){
			if(temp.compareTo(after) == 0){
				return temp;
			}
		}
		return null;
	}
	
	public void printList() {
		SLLNode<T> temp;
		for(temp = head; temp != null; temp = temp.getNext()){
			System.out.println(temp.getValue());
		}
	}
}

class SLLNode<T> implements Comparable<T> {
	
	private T value;
	private SLLNode<T> next;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public SLLNode<T> getNext() {
		return next;
	}
	
	public void setNext(SLLNode<T> next) {
		this.next = next;
	}

	public int compareTo(T arg) {
		if(arg == this.value)
			return 0;
		return 1;
	}
	
}