
public class Lime extends FruitJuice {
	Integer quantity;
	private Integer price = 30;
	
	public Lime(Integer quantity) {
		super(30);
		this.quantity = quantity;
		System.out.println("\nPreparing Lime shake...");
	}

	public Integer getPrice() {
		return price;
	}
}
