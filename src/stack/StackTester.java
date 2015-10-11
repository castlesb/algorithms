/**
 * 
 */
package stack;

/**
 * @author briancastles
 * 
 * Test for ArrayStack and LinkedStack classes
 *
 */
public class StackTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Array Stack Test:\n");
		ArrayStack<String> arrayStack = new ArrayStack<String>();
		arrayStack.push("Brian Castles");
		arrayStack.push("Ben Franklin");
		arrayStack.push("Christopher Columbus");
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.push("Thomas Jefferson");
		arrayStack.displayStack();
		
		System.out.println("\n\nLinked Stack Test:\n");
		LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();
		linkedStack.push(10);
		linkedStack.push(5);
		linkedStack.push(3);
		linkedStack.peek();
		linkedStack.pop();
		linkedStack.push(7);
		linkedStack.peek();
		linkedStack.displayStack();
	}

}
