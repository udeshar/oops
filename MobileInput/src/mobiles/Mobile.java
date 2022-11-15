package mobiles;

public class Mobile {
	private String brandName;
	private String model;
	
	Mobile(String brandName, String model){
		this.setBrandName(brandName);
		this.setModel(model);
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
