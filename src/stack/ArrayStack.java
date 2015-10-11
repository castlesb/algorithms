package stack;

import java.util.EmptyStackException;
/**
 * @author briancastles
 *
 * Last-in first-out
 * Items are added and removed from the top
 *
 * Time complexities:
 * 
 *  Push: O(1)
 *  Pop: O(1)
 *  Peek: O(1)
 */
public class ArrayStack<E> {
	
	/** Array for the stack. */
	private E[] theData;

	/** Index to top of stack. */
	private int size = 0;

	private static final int INITIAL_CAPACITY = 10;

	/** Construct an empty stack with the default initial capacity. */
	public ArrayStack () {
		theData = (E[])new Object[INITIAL_CAPACITY];
	}
	
	/** Pushes an item onto the top of the stack. */
	public void push (E obj) {
		if (size == theData.length)
			reallocate();

		theData[++size] = obj;
	}
	
	/** Returns the object at the top of the stack and removes it.
    Then decrements the size of the stack. */
	public void pop () {
		if (isEmpty())
			throw new EmptyStackException();

		size--;
	}
	
	public E peek () {
		if (isEmpty())
			throw new EmptyStackException();
		  
		return theData[size];
	}
	
	public boolean isEmpty () {
		if (size == 0)
			return true;
		else
			return false;
	}
	
	/** Replace theData with one twice as big. */
	  private void reallocate () {
		  E[] newData = (E[]) new Object[2 * theData.length];
	      System.arraycopy(theData, 0, newData, 0, theData.length);
	      theData = newData;
	  }
	  
	  public void displayStack() {
		  for(int i = size; i > 0; i--){
		  System.out.println(theData[i]);
		  }
	  }

}
