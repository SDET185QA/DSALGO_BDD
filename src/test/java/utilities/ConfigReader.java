package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    // Define the path to the config.properties file
    private static String propertyFilePath = "src/test/resources/Config/config.properties";

    // Properties object to store the configuration
    private static Properties properties;

    // Static initializer to load the config.properties file
    static {
        properties = new Properties();
        try {
            // Create a FileInputStream to read the config.properties file
            FileInputStream fis = new FileInputStream(new File(propertyFilePath));
            // Load the properties from the file into the Properties object
            properties.load(fis);
            // Close the FileInputStream
            fis.close();
        } catch (IOException e) {
            // Handle any errors that occur while loading the properties
            System.err.println("Error reading config.properties file: " + e.getMessage());
        }
    }


	public static String getApplicationUrl(String key) {
		String url = properties.getProperty(key);
		System.out.println(url);
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
//	public static void main(String[] args) {
//		ConfigReader config = new ConfigReader();
//		String key = "url";	
//		config.getApplicationUrl(key);		
//	}

















	

}