
public class Pineapple extends FruitJuice {
	Integer quantity;
	private Integer price = 70;
	
	public Pineapple(Integer quantity) {
		super(70);
		this.quantity = quantity;
		System.out.println("\nPreparing Pineapple shake...");
	}

	public Integer getPrice() {
		return price;
	}
}
