
public class Banana extends MilkShake{
	Integer quantity;
	private Integer price = 50;
	
	public Banana(Integer quantity) {
		super(50);
		this.quantity = quantity;
		System.out.println("\npreparing Banana shake...");
	}

	public Integer getPrice() {
		return price;
	}
}
