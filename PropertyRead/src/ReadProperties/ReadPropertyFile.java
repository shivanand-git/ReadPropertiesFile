package ReadProperties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public String readProperty(String Key) throws IOException {
		File prop_file = new File("./Properties/Application_Config.properties");
		FileReader f = new FileReader(prop_file);
		Properties prop = new Properties();
		prop.load(f);
		return prop.get(Key).toString();

    }
}
