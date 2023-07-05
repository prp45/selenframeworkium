package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Property_Utility {
	public String getKeysValue(String Key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String Value = pro.getProperty(Key);
		return Value;
	}

}
