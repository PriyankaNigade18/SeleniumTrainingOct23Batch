package controlFlowStatements;

import java.util.Scanner;

public class ForLoopScenarios {

	public static void main(String[] args)
	{
		// print table of 2
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
//		//int num=2;
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(num*i);
//		}
		
		System.out.println("********************");
		
		//Nested for loop
		
		
		for(int no=1;no<=10;no++)//row
		{
			
			for(int c=1;c<=10;c++)//column
			{
				System.out.print(no*c+"\t");
			}
			System.out.println();
			
			
		}
		System.out.println("********************");

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("********************");
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("********************");

		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				System.out.print(i+" ");
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
