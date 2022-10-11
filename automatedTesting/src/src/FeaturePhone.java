package src;

public class FeaturePhone extends MobilePhones {

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("switching on the phone....");
	}
	
	public void bootMode() {
		System.out.println("Devices starting with normal mode");
	}
	
	public void bootMode(Boolean bootMode) {
		System.out.println("Devices started with boot mode: "+ bootMode);
	}

}
