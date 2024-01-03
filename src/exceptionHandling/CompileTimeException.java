package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CompileTimeException {

	/*
	 * by default all compile time exceptions handles by JVM
	 */
	public static void main(String[] args) throws  Exception //InterruptedException, IOException
	{
		System.out.println("Program starts.....");
		
		Thread.sleep(4000);
		
		System.out.println("Program stoped!");
		
		//properties file
		//file path in File object
		File f1=new File("./"+"\\Config.properties");
				
		FileInputStream fs=new FileInputStream(f1);
		
		//To read data from properties file --->load
		Properties p1=new Properties();
		
		p1.load(fs);
		
		
		System.out.println("UserName is: "+p1.getProperty("un"));
		System.out.println("Password is: "+p1.getProperty("psw"));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
