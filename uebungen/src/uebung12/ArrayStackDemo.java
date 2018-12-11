package uebung12;

public class ArrayStackDemo {
	public static void main(String[] args) {
		LinkedStack stack= new LinkedStack();
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
