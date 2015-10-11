/**
 * 
 */
package list;

/**
 * @author briancastles
 *
 */
public class LinkedListTester {

	public static void main(String[] args) {
		
		System.out.println("Test for Singly Linked List implementation:");
		/** A singly linked list of type String*/
		SinglyLinkedList<String> list1 = new SinglyLinkedList<String>();
		
		list1.add("Brian Castles");
		list1.add("Tom Brady");
		list1.addAfter("Payton Manning", "Brian Castles");
		list1.add("Tom Hanks");
		list1.add("Matt Damon");
		list1.addAfter("Leonardo DiCaprio", "Tom Hanks");
		list1.addAfter("Mike Tyson", "Payton Manng");
		list1.addAfter("Mike Tyson", "Brian Castles");
		list1.delete("Mike Tyson");
		
		list1.printList();
		
		System.out.println("\n\nTest for Doubly Linked List implementation:");
		/** A singly linked list of type String*/
		DoublyLinkedList<String> list2 = new DoublyLinkedList<String>();
		
		list2.add("Brian Castles");
		list2.add("Tom Brady");
		list2.addAfter("Payton Manning", "Brian Castles");
		list2.add("Tom Hanks");
		list2.add("Matt Damon");
		list2.addAfter("Leonardo DiCaprio", "Tom Hanks");
		list2.addAfter("Mike Tyson", "Payton Manng");
		list2.addAfter("Mike Tyson", "Brian Castles");
		list2.delete("Mike Tyson");
		list2.delete("Matt Damon");
		list2.delete("Brian Castles");
		list2.delete("Brian Castles");

		
		list2.printList();


	}

}
