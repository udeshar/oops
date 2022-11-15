package mobiles;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilesData {
	private List<Mobile> mobiles = new ArrayList<>();
	
	public List<Mobile> getMobiles() {
		return mobiles;
	}
	
	public void loadMobiles(String fileUrl) {
		File fileinput;
		Scanner sc;
		try {
			fileinput = new File(fileUrl);
			sc=new Scanner(fileinput);
			while(sc.hasNextLine()){
				String s = sc.nextLine();
				String recodFields[];
				recodFields = s.split(",");
				mobiles.add(new Mobile(recodFields[0],recodFields[1]));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("File content loaded");
		}
	}
	
	public void createOutputFile(String outputfilename) {
		PrintStream p;
		try {
			p = new PrintStream(new File(outputfilename));
			PrintStream console = System.out;
			System.setOut(p);
			for(Mobile mobile : mobiles) {
				System.out.println(mobile.getModel() + " - " + mobile.getBrandName());
			}
			System.setOut(console);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nOutput written to "+ outputfilename +" file\n");
		}
	}
}
