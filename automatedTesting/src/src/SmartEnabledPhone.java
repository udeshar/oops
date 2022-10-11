package src;

public class SmartEnabledPhone extends FeaturePhone implements SmartFeatures {

	
	@Override
	public void getTotalSims() {
		System.out.println("Total numbers of sim: "+numOfSims);
	}
	
	public void bootMode(Boolean bootMode) {
		System.out.println("Devices started with boot mode: "+ bootMode +" ____"+ this.getClass());
	}
	
	public void bootMode() {
		System.out.println("Devices started with normal mode ____" + this.getClass());
		deviceSpecification();
	}

	@Override
	public void deviceSpecification() {
		System.out.println("\nNumber of sim : " + numOfSims);
		System.out.println("Network type : " + networkType);
		System.out.println("Battery capacity : "+batteryMah);
		System.out.println("E sim : "+eSim);
	}
}
