package palindrome;

public class factorial {
	public static void main(String[] args) {
		System.out.println("Factorial of 5 :");
		fact(5);
	}
	static void fact(int num) {
		int fact = 1;
		for(int i =num;i> 0; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
