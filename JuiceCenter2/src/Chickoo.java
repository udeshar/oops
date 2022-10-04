
public class Chickoo extends MilkShake {
	Integer quantity;
	private Integer price = 40;
	
	public Chickoo(Integer quantity) {
		this.quantity = quantity;
		System.out.println("\npreparing Chickoo shake...\n");
	}

	public Integer getPrice() {
		return price;
	}
}
