package resource;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Uimapper {
	///home/rajiv/eclipse-workspace/assur/src/test/java/resources/elements.properties
	


//	private String RepositoryFile;
	/*
	public static FileInputStream  stream; 
	public static Properties propertiesFile = new Properties();	
	
	private static void Uimapper() throws IOException {
		
//		this.RepositoryFile = filename;
		stream = new FileInputStream("/home/rajiv/eclipse-workspace/assur/src/test/java/resources/elements.properties");
		propertiesFile.load(stream);
	}
	
	

	
	public static String readPropertyFile(String key) {
		String value = propertiesFile.getProperty(key);
		return value;
	}
	
	*/
	
	private static Properties propertiesFile = new Properties();

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.home")+"/eclipse-workspace/DIAGONAL/src/test/java/resource/elements.properties");
            propertiesFile.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readPropertyFile(String key) {
        return propertiesFile.getProperty(key);
    }
	
	
		

}
