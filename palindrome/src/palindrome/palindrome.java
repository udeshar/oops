package palindrome;

import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the value to check for palindrome");
		System.out.println("131");
		int num =131;
		int a,sum = 0;
		int n = num;
		while(n > 0) {
			a = n % 10;
			sum = sum * 10 + a;
			n = n / 10;
		}
		if(num == sum) {			
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}
