package controlFlowStatements;

import java.util.Scanner;

public class RealTimeNestedCodeForBrowser {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your browser name");
		String bname=sc.nextLine();
//		
		/*
		 * String is class in java
		 * Validate String using Methods
		 * 
		 * equality:(text)
		 * 1.equals()-case sensitive 
		 * 2.equalsIgnoreCase() - not case sensitive
		 * 
		 * String s1="Hello All";
			String s2="Hello all";
		
			System.out.println(s1.equals(s2));//false
		
			System.out.println(s1.equalsIgnoreCase(s2));//true
		 */
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on Chrome");
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing on Firefox");
		}
		else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing on Edge");
		}else
		{
			System.out.println("Please provide vallid browser name!");
		}
			
			
		
		
		
		
		
		
		
		

	}

}
