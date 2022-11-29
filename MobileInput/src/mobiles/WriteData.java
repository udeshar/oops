package mobiles;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class WriteData {
	public void createOutputFile(String outputfilename, List<Mobile> data) {
//		PrintStream p;
		Boolean tt = false;
		try {
//			p = new PrintStream(new File(outputfilename));
//			PrintStream console = System.out;
//			System.setOut(p);
//			for(Mobile mobile : data) {
//				System.out.println(mobile.getModel() + " , " + mobile.getBrandName());
//			}
//			System.setOut(console);
			try (FileWriter fw = new FileWriter(new File(outputfilename))) {
				for(Mobile mobile : data) {
					fw.write(mobile.getModel() + " , " + mobile.getBrandName() + "\n");
				}
			}
			tt = true;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(tt == true) System.out.println("\nOutput written to "+ outputfilename +" file\n");
		}
	}
}
