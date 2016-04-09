import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

 
public class GetPropertyValues {
	String result = "";
	InputStream inputStream;
 
	public String getPropValues() throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "ConfigurationFile.txt";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			// get the property value and print it out
			String game = prop.getProperty("Game");
			String g = prop.getProperty("GrawitationalConstat");
			String lv = prop.getProperty("Level");
			String nofl = prop.getProperty("NumberOfLives");
 
			result = "Game configuration " + game + "\n" + 
			"Grawitational Constat = " + g + "\n" + 
			"Level = " + lv +  "\n" + 
			"Number of lives = " + nofl + "\n";
			
			System.out.println(result + "\nProgram Ran on " + time + "\n for game = " + game);
			
			prop.list(System.out);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}
