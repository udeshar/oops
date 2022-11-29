package mobiles;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadData {
	
	public List<Mobile> loadMobiles(String fileUrl) {
		List<Mobile> data = new ArrayList<>();
		File fileinput;
		Scanner sc;
		Boolean tt = false;
		try {
			fileinput = new File(fileUrl);
			sc=new Scanner(fileinput);
			while(sc.hasNextLine()){
				String s = sc.nextLine();
				String recodFields[];
				recodFields = s.split(",");
				Mobile m = new Mobile(recodFields[0],recodFields[1]);
				data.add(m);
			}
			tt=true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(tt == true) System.out.println("File content loaded");
		}
		return data;
	}
}
