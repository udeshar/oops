import java.util.*;
import java.util.ArrayList;

public class Customer {
	public static void main(String [] args) {
		Shop fruitShop = new Shop();
		
		List<String> myDrinks = new ArrayList<>();
		myDrinks.add("Mango Shake");
		myDrinks.add("Pineapple");
		myDrinks.add("Lime");
//		myDrinks.addAll(["Mango Shake", "Pineapple", "Lime"]);
		
		List<Drink> myOrderedDrinks = fruitShop.order(myDrinks);
		
		int size = myOrderedDrinks.size();
		int total = 0;
		
		for(int i = 0; i < size; i++) {
			total = total + myOrderedDrinks.get(i).price;
		}
		System.out.println("\n\n\nTotal = "+ total);
	}
}
