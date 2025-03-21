package readPropertiesData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {
	public static void main(String[] args) throws IOException {
		
		//to specify the location of the file
	FileInputStream fis = new FileInputStream("./testData/config.properties");
	
	// to make the file ready to read
	 Properties prop = new Properties();
	 prop.load(fis);
	 
	 // to read  the data from properties file
	String data = prop.getProperty("url");
	System.out.println(data);
	}

}
