package uebung12;

public class LinkedStackDemo {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(3);
		System.out.println("Stack: " + stack);
		System.out.println("Pop: " + stack.pop());
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println("Stack: " + stack);
		System.out.println("Pop: " + stack.pop());
		System.out.println("Stack: " + stack);
		System.out.println("Pop: " + stack.pop());
		System.out.println("Stack: " + stack);
	}

}
