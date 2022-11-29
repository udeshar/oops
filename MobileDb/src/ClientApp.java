import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbConnection.DbConnection;
import mobiles.Mobile;
import mobiles.WriteData;
import mobiles.LoadData;

public class ClientApp {
	
	public static void insert() {  
        String sql = "INSERT INTO indexsqlite_autoindex_laptop_1laptop(id, brand, price) VALUES(?,?,?)";  
   
        try{  
//            Connection conn = this.connect();  
        	Connection conn = DbConnection.connect("C:\\Users\\udesh\\Desktop\\myWorkspace\\oops\\MobileDb\\mobiledb.sqlite");
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setInt(1, 1);  
            pstmt.setString(2, "dgcvd"); 
            pstmt.setInt(3, 100000);
            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    } 
	   
	public static void main(String[] args) {
		
//		Connection conn = DbConnection.connect("C:\\Users\\udesh\\Desktop\\myWorkspace\\oops\\MobileDb\\mobiledb.sqlite");
		
//		insert();
		insert();
		
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