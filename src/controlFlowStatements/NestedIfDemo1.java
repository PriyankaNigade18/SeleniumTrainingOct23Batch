package controlFlowStatements;

import java.util.Scanner;

public class NestedIfDemo1 {

	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);
		
		//operators
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}else
		{
			System.out.println(ch+" is not a vowel");
		}
		
		
		
		/*
		//Nested Pattern
		if(ch=='a')
		{
			System.out.println(ch+"  is a vowel");
		}else if(ch=='e')
		{
			System.out.println(ch+"  is a vowel");
		}else if(ch=='i')
		{
			System.out.println(ch+"  is a vowel");
		}else if(ch=='o')
		{
			System.out.println(ch+"  is a vowel");
		}else if(ch=='u')
		{
			System.out.println(ch+"  is a vowel");
		}else
		{
			System.out.println(ch+" is not a vowel");
		}
		
		
		
		
		
		
		
		
		
		

		/*
		int a=100,b=20,c=400;
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater than "+b+" & "+c);
		}else if(b>a && b>c)
		{
			System.out.println(b+" is greater than "+a+" & "+c);
		}else
		{
			System.out.println(c+" is greater than "+a+" & "+b);
		}
		*/	
		
		
		
		
		
		

	}

}
