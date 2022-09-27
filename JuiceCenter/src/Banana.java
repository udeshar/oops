
public class Banana extends MilkShake{
	Integer quantity;
	private Integer price = 50;
	
	public Banana(Integer quantity) {
		this.quantity = quantity;
		System.out.println("\npreparing Banana shake...\n");
	}

	public Integer getPrice() {
		return price;
	}
}
