import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dbConnection.DbConnection;
import mobiles.Mobile;
import mobiles.WriteData;
import mobiles.LoadData;

public class ClientApp {
	public static void main(String[] args) {
		
		Connection conn = DbConnection.connect("C:\\Users\\udesh\\Desktop\\myWorkspace\\oops\\MobileDb\\mobiledb.sqlite");
		
		List<Mobile> mobileList = new ArrayList<>();
		
		LoadData loaddata = new LoadData();
		WriteData writeData = new WriteData();
		
//		Take input from file
		mobileList.addAll(loaddata.loadMobiles("input.txt"));
		
//		generate output to file
		writeData.createOutputFile("outputfile.txt", mobileList);
		
//		get mobile list
		displayMobile(mobileList);
		
	}
	
	static void displayMobile(List<Mobile> mobiles) {
		for(Mobile m : mobiles) {
			System.out.println(m.getModel() + " , " + m.getBrandName());
		}
	}
}