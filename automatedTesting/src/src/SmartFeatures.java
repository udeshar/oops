package src;

public abstract interface SmartFeatures {
	public final Integer numOfSims = 2;
	public final String networkType = "5G";
	public final Boolean eSim = true;
	public final Integer batteryMah = 10000;
	public abstract void getTotalSims();
	public abstract void deviceSpecification();
}
