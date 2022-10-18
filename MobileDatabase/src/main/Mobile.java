package main;

public class Mobile {
	
	private String brandName;
	private String modalName;
	private Integer price;
	
//	quantative attributes
	private Integer batteryCapacity;
	private Integer ramCapacity;
	private Integer noOfSimSlots;
	
//	Qualtative attributes
	private String connectivity;
	private Boolean wifiCalling;
	private Notch notchType;
	
	public Mobile(){
		//System.out.println("Mobile initialised");
	}
	
	public Mobile(
			String brandName, 
			String modalName, 
			Integer price, 
			Integer batteryCapacity, 
			Integer ramCapacity, 
			Integer noOfSimSlots,
			String connectivity,
			Boolean wifiCalling,
			Notch notchType
		){
		this.brandName = brandName;
		this.modalName = modalName;
		this.price = price;
		this.batteryCapacity = batteryCapacity;
		this.ramCapacity = ramCapacity;
		this.noOfSimSlots = noOfSimSlots;
		this.connectivity = connectivity;
		this.wifiCalling = wifiCalling;
		this.notchType = notchType;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModalName() {
		return modalName;
	}

	public void setModalName(String modalName) {
		this.modalName = modalName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Integer batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Integer getRamCapacity() {
		return ramCapacity;
	}

	public void setRamCapacity(Integer ramCapacity) {
		this.ramCapacity = ramCapacity;
	}

	public Integer getNoOfSimSlots() {
		return noOfSimSlots;
	}

	public void setNoOfSimSlots(Integer noOfSimSlots) {
		this.noOfSimSlots = noOfSimSlots;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public Boolean getWifiCalling() {
		return wifiCalling;
	}

	public void setWifiCalling(Boolean wifiCalling) {
		this.wifiCalling = wifiCalling;
	}

	public Notch getNotchType() {
		return notchType;
	}

	public void setNotchType(Notch notchType) {
		this.notchType = notchType;
	}
	
}
