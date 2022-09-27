
public class Pineapple extends FruitJuice {
	Integer quantity;
	private Integer price = 40;
	
	public Pineapple(Integer quantity) {
		this.quantity = quantity;
		System.out.println("\nPreparing Pineapple shake...\n");
	}

	public Integer getPrice() {
		return price;
	}
}
