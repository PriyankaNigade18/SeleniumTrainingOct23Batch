package controlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);
		
		
		switch(ch)
		{
		case 'a':
			System.out.println(ch+" is a vowel");
			break;
		case 'e':
			System.out.println(ch+" is a vowel");
			break;
		case 'i':
			System.out.println(ch+" is a vowel");
			break;
		case 'o':
			System.out.println(ch+" is a vowel");
			break;
		case 'u':
			System.out.println(ch+" is a vowel");
			break;
			
			default:
				System.out.println(ch+" is not a vowel");
			
		}
		
		
		
		
		
		/*
		System.out.println("Enter a number from 0 to 5");
		int num=sc.nextInt();
		
		switch (num) 
		{
		case 0:
			System.out.println("Zero");
			break;//break from switch body
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;			
		default:
			System.out.println("Please Enter valid number!");
		}
		
		*/
		

	}

}
