package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileData {
	
	public PropertyFileData(String dataFolder,String dataFile) throws IOException {
		Properties pro = new Properties();
		InputStream inputStr = new FileInputStream("C:\\Users\\ssa\\eclipse-workspace\\com.tiqri.automation\\dataFiles\\"+dataFolder+"\\"+dataFile+".properies");
		pro.load(inputStr);
	}

	private void setDataFile() {
		// TODO Auto-generated method stub
		
	}

	private void setDataFolder() {
		// TODO Auto-generated method stub
		
	}

}
