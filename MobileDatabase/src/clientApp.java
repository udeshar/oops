import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.Mobile;
import main.MobileIS;

public class clientApp {

	public static void main(String[] args) {
		MobileIS mobileDb = new MobileIS();
		
		//set mobile list
		List<Mobile> mobileList = new ArrayList<>();
		Mobile m1 = new Mobile();
		m1.setBrandName("Smasung");
		m1.setModalName("Galaxi A12");
		m1.setPrice(20000);
		mobileList.add(m1);
		
		Mobile m2 = new Mobile();
		m2.setBrandName("iphone");
		m2.setModalName("iPhone XE");
		m2.setPrice(30000);
		mobileList.add(m2);
		mobileDb.setAllMobileList(mobileList);
		
		
		//Display mobile
		System.out.println("\nList of all mobiles");
		List<Mobile> listOfMobile = mobileDb.getAllMobileList();
		for(Integer i = 0; i < listOfMobile.size(); i++) {
			System.out.println(i+1 + " - " + listOfMobile.get(i).getBrandName()+ " " + listOfMobile.get(i).getPrice());
		}
		
		//Display by modal name
		System.out.println("\nGet mobile by modal name");
		Map<String, Mobile> mobileByModalname = mobileDb.listByBrandName("iPhone XE");
		System.out.println(mobileByModalname.get("iPhone XE").getModalName());
		
		//Display mobile by price	
		System.out.println("\nGet mobile by price greater then 10000");
		Map<String,List<Mobile>> listByPrice = mobileDb.getMobileByPrice(true, 40000);
		for(Integer i = 0; i < listByPrice.size(); i++) {
			System.out.println(i+1 + " - " + listOfMobile.get(i).getBrandName());
		}
		
	}

}
