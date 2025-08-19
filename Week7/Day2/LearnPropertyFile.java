package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnPropertyFile {

	public static void main(String[] args) throws IOException {
		//step1:
		FileInputStream fis=new FileInputStream("src/main/resources/english.properties");
		
		//Step2:
		Properties prop=new Properties();
		
		//Step3
		prop.load(fis);
		
		String user = prop.getProperty("username");
		System.out.println(user);
		
		String pass = prop.getProperty("password");
		System.out.println(pass);
		
		
		
		
		

	}

}
