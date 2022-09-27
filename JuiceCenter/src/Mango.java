
public class Mango extends MilkShake {
	
	Integer quantity;
	private Integer price = 40;
	
	public Mango(Integer quantity) {
		this.quantity = quantity;
		System.out.println("\npreparing Mango shake...\n");
	}

	public Integer getPrice() {
		return price;
	}

}
