package genericPackage;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {

		/*
		 * Flib flib = new Flib(); 
		 * String url =flib.readPropertyData("./src/main/resources/Config.properties", "url");
		 * System.out.println(url);
		 */

		Flib flib = new Flib();
		String data = flib.readExcelData("./src/main/resources/TestData.xlsx", "validcreds", 1, 0);
		System.out.println(data);
		
		
		
	}

}
