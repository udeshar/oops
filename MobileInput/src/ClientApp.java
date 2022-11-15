import java.util.List;

import mobiles.Mobile;
import mobiles.MobilesData;

public class ClientApp {
	public static void main(String[] args) {
		MobilesData loadMobiles = new MobilesData();
		
//		Take input from file
		loadMobiles.loadMobiles("input.txt");
		
//		generate output to file
		loadMobiles.createOutputFile("outputfile.txt");
		
//		get mobile list
		displayMobile(loadMobiles.getMobiles());
		
	}
	
	static void displayMobile(List<Mobile> mobiles) {
		for(Mobile m : mobiles) {
			System.out.println(m.getModel() + " - " + m.getBrandName());
		}
	}
}
