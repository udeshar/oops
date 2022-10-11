package automatedTesting;
import src.FeaturePhone;
import src.SmartEnabledPhone;

public class clientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FeaturePhone a = new FeaturePhone();
		FeaturePhone a = new SmartEnabledPhone();
		a.switchOn();
//		a.getTotalSims();
		a.bootMode(false);
		a.bootMode();
	}

}
