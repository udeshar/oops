
public class Mango extends MilkShake {
	
	Integer quantity;
	private Integer price = 20;
	
	public Mango(Integer quantity) {
		super(20);
		this.quantity = quantity;
		System.out.println("\npreparing Mango shake...");
	}

	public Integer getPrice() {
		return price;
	}

}
