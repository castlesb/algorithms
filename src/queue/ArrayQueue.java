/**
 * 
 */
package queue;

import java.util.Arrays;

/**
 * @author briancastles
 *
 */
public class ArrayQueue<T> {
	
	private T[] theData;
	private int size;
	private int front;
	private int rear;
	
	public ArrayQueue(int initCapacity) {
		if(initCapacity <= 0)
			throw new IllegalArgumentException("Size cannot be less or equal to 0");
		theData = (T[]) new Object[initCapacity];
		size = 0;
		front = 0;
		rear = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public T peek() {
		if(isEmpty()) throw new RuntimeException("Queue underflow");
		
		return theData[size];
	}
	
	public void enqueue(T item) {
		if(size == theData.length)
			throw new IllegalStateException("Queue is full");
		
		theData[rear] = item;
		rear = (rear + 1) % theData.length;
		size++;
	}
	

	public T dequeue() {
		if(isEmpty()) throw new IllegalStateException("Queue underflow");
		
		T item = theData[front];
		
		theData[front] = null;
		front = (front + 1) % theData.length;
		size--;
		return item;
	}
	
	public String toString() {
		return("Front = " + front + ", Rear = " + rear + ", Size = " + size + "\nQueue: "
				+ Arrays.toString(theData) + "\n");
	}
	
}
