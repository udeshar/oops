
public class Chickoo extends MilkShake {
	Integer quantity;
	private Integer price = 40;
	
	public Chickoo(Integer quantity) {
		super(40);
		this.quantity = quantity;
		System.out.println("\npreparing Chickoo shake...");
	}

	public Integer getPrice() {
		return price;
	}
}
