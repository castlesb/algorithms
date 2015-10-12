/**
 * 
 */
package queue;

/**
 * @author briancastles
 *
 *	Test for the Queue implementation
 */
public class QueueTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayQueue<String> arrayQueue = new ArrayQueue<String>(10);
		System.out.println("Array Queue Implementation:");
		arrayQueue.enqueue("person 1");
		arrayQueue.enqueue("person 2");
		arrayQueue.enqueue("person 3");
		arrayQueue.enqueue("person 4");
		System.out.println(arrayQueue.toString());
		arrayQueue.dequeue();
		arrayQueue.dequeue();
		arrayQueue.dequeue();
		System.out.println(arrayQueue.toString());
		
		LinkedQueue<Integer> linkedQueue = new LinkedQueue<Integer>();
		System.out.println("Linked Queue Implementation:");
		linkedQueue.enqueue(1);
		linkedQueue.enqueue(2);
		linkedQueue.enqueue(3);
		linkedQueue.enqueue(4);
		System.out.println(linkedQueue.toString());
		linkedQueue.dequeue();
		linkedQueue.dequeue();
		System.out.println(linkedQueue.toString());


	}

}
