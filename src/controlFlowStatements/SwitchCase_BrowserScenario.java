package controlFlowStatements;

import java.util.Scanner;

public class SwitchCase_BrowserScenario {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a browser name chrome/firefox/edge");
		String bname=sc.nextLine();
		/*
		 * String class Case conversion methods are
		 * 1.toUpperCase()
		 * 2.toLowerCase()
		 * 
		 */
		switch (bname.toLowerCase()) {
		case "chrome":
			System.out.println("Test case is excuting on chrome");
			break;
		case "firefox":
			System.out.println("Test case is excuting on firefox");
			break;
		case "edge":
			System.out.println("Test case is excuting on edge");
			break;

		default:
			System.out.println("Please provide valid browser name!");
		}
		
		sc.close();
	}

}
