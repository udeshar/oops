import java.util.*;

public class Shop {
	
	private String shakeName;
	Drink drink;
	
	Shop(){
		System.out.println("_______Welcome to Udesh Fruit Shop_______");
		System.out.println("Mango shake and Fruit juice are available");
		System.out.println("\nAvailable Drinks\n\n ----Mango Shake\n ----Chickoo Shake\n ----Pineapple Juice\n ----Lime Juice");
	}
	
	public List<Drink> order(List<String> drinks ) {
		
		Integer size = drinks.size();
		List<Drink> orderedDrink = new ArrayList<>(); 
		
		for(int i = 0; i < size; i++) {
		
			this.shakeName = drinks.get(i);
			
			switch(this.shakeName) {
			
				case "Mango Shake":
					Mango mangoShake = new Mango(250);
					System.out.println("your "+this.shakeName+" is ready");
					System.out.println(this.shakeName + " price - "+mangoShake.getPrice());
					this.drink = mangoShake;
					orderedDrink.add(mangoShake);
					break;
					
				case "Chikoo Shake":
					Chickoo chickooShake = new Chickoo(500);
					System.out.println("your "+this.shakeName+" is ready");
					System.out.println(this.shakeName + " price - "+chickooShake.getPrice());
					this.drink = chickooShake;
					orderedDrink.add(chickooShake);
					break;
					
				case "Banana Shake":
					Banana bananaShake = new Banana(500);
					System.out.println("your "+this.shakeName+" is ready");
					System.out.println(this.shakeName + " price - "+bananaShake.getPrice());
					this.drink = bananaShake;
					orderedDrink.add(bananaShake);
					break;
					
				case "Pineapple":
					Pineapple pineappleJuice = new Pineapple(500);
					System.out.println("your "+this.shakeName+" is ready");
					System.out.println(this.shakeName + " price - "+pineappleJuice.getPrice());
					this.drink = pineappleJuice;
					orderedDrink.add(pineappleJuice);
					break;
					
				case "Lime":
					Lime limeJuice = new Lime(500);
					System.out.println("your "+this.shakeName+" is ready");
					System.out.println(this.shakeName + " price - "+limeJuice.getPrice());
					this.drink = limeJuice;
					orderedDrink.add(limeJuice);
					break;
				
				default:
					drink = new Mango(250);
				
			}
		
		}
		return orderedDrink;
	}

}
