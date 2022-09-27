
public abstract class Drink {
	
	private String shakeName;

	public Drink orderShake(String shakeName) {
		this.shakeName = shakeName;
		System.out.println("\n"+this.shakeName + " has been ordered");
		Drink drink;
		
		switch(this.shakeName) {
			case "Mango Shake":
				Mango mangoShake = new Mango(250);
				System.out.println("your "+this.shakeName+" is ready");
				System.out.println(this.shakeName + " price - "+mangoShake.getPrice());
				drink = mangoShake;
				break;
			case "Chikoo Shake":
				Chickoo chickooShake = new Chickoo(500);
				System.out.println("your "+this.shakeName+" is ready");
				System.out.println(this.shakeName + " price - "+chickooShake.getPrice());
				drink = chickooShake;
				break;
			case "Banana Shake":
				Banana bananaShake = new Banana(500);
				System.out.println("your "+this.shakeName+" is ready");
				System.out.println(this.shakeName + " price - "+bananaShake.getPrice());
				drink = bananaShake;
				break;
			case "Pineapple":
				Pineapple pineappleJuice = new Pineapple(500);
				System.out.println("your "+this.shakeName+" is ready");
				System.out.println(this.shakeName + " price - "+pineappleJuice.getPrice());
				drink = pineappleJuice;
				break;
			case "Lime":
				Lime limeJuice = new Lime(500);
				System.out.println("your "+this.shakeName+" is ready");
				System.out.println(this.shakeName + " price - "+limeJuice.getPrice());
				drink = limeJuice;
				break;
			default:
				drink = new Mango(250);
		}
		return drink;
	}

}
