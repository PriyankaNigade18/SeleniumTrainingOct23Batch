package controlFlowStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else
		{
			System.out.println(b+" is greater than "+a);
		}
		
		
		/*
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Age is valid");
		}else
		{
			System.out.println("Age is not valid");
		}
		*/
		sc.close();

	}

}
