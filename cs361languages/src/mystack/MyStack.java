/**
 * 
 */
package mystack;

/**
 * @author JULIA TRETYAKOV
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete (DONE)
		if (theStack == null) {
			return null;
		}
		T t = theStack.val;
		theStack = theStack.next;
		return t;
		
	}

	public void push(T v) {
		// TODO To complete (DONE)
		MyNode<T> n = new MyNode<>(v, theStack);
		theStack = n;
	
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete (DONE)
		// Create a stack of Integer
		MyStack<Integer> myNewStack = new MyStack<>();
		// Push 1 and 2
		myNewStack.push(1);
		myNewStack.push(2);

		// Pop
		myNewStack.pop();
		// Push 5
		myNewStack.push(5);
		
		// TODO To complete(DONE)
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<>();
		
		// Push a person p1 with your name
		Person p1 = new Person("Julia", "Tretyakov");
		personStack.push(p1);
		
		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Scharff");
		personStack.push(p2);
	}

}
