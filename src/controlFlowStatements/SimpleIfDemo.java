package controlFlowStatements;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		//validate using simple if-true
		if(age>=18)
		{
			System.out.println("Age is valid!");
		}

		sc.close();
	}

}
