import Stack.StackImpl;

public class ClientApp {

	public static void main(String[] args) {
		StackImpl stack = new StackImpl(false);
		
//		Push into stack
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(180);
		stack.push(95);
		stack.push(45);
		stack.push(55);
		stack.push(67);
		
//		print the stack
		System.out.println("\nPrinting stack");
		stack.printStack();
		
//		Pop some element from stack
		System.out.println("\npop element from stack");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
//		print the stack
		System.out.println("\nPrinting stack");
		stack.printStack();
		
//		Peek element 
		System.out.println("\nFirst element of stack - peek");
		System.out.println(stack.peek());
	}

}
