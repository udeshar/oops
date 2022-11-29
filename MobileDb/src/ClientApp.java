import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbConnection.DbConnection;
import mobiles.Mobile;
import mobiles.WriteData;
import mobiles.LoadData;

public class ClientApp {
	
	public static Connection conn = DbConnection.connect("C:\\Users\\udesh\\Desktop\\myWorkspace\\oops\\MobileDb\\mobiledb.sqlite");
	
	public static void insert() {  
        String sql = "INSERT INTO mobiles(id, brand, price) VALUES(?,?,?)";  
   
        try{  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setInt(1, 12);  
            pstmt.setString(2, "dgcvd"); 
            pstmt.setInt(3, 100000);
            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    } 
	
	public static void create() {
		  String sql = "CREATE TABLE IF NOT EXISTS mobiles (\n"  
	                + " id integer PRIMARY KEY,\n"  
	                + " brand text NOT NULL,\n"  
	                + " price integer\n"  
	                + ");";
		  try{   
	            Statement stmt = conn.createStatement();  
	            stmt.execute(sql);  
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	}
	
	public static void selectAll(){  
        String sql = "SELECT * FROM mobiles";  
          
        try {   
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) {  
                System.out.println(rs.getInt("id") +  "\t" +   
                                   rs.getString("brand") + "\t" +  
                                   rs.getString("price"));  
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
	   
	public static void main(String[] args) {
		
		create();
		insert();
		selectAll();
		
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