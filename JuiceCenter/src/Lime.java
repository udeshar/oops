
public class Lime extends FruitJuice {
	Integer quantity;
	private Integer price = 40;
	
	public Lime(Integer quantity) {
		this.quantity = quantity;
		System.out.println("\nPreparing Lime shake...\n");
	}

	public Integer getPrice() {
		return price;
	}
}
