package exceptionHandling;

import java.util.Scanner;

public class RunTimeException
{
	int id=101;

	public static void main(String[] args)
	{
		RunTimeException r1=new RunTimeException();
		r1=null;//object is null
		try {
		System.out.println(r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Object is null check the data!");
		}
		
		System.out.println("completed!");
		System.out.println("********************************");
		
		//NumberFormatException - if the string does not contain a parsable integer.
		String s1="100ssd";
		System.out.println(s1+100);//100100
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		}catch(NumberFormatException t)
		{
			System.out.println("Object is not convertable, check the object");
		}
		
		System.out.println("********************************");

		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid index between 0 to 4");
		int index=sc.nextInt();
		
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
		}
		catch(Exception e)
		{
			System.out.println("Provide valid index only!");
		}
		sc.close();
		
		System.out.println("********************************");
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		try {
		System.out.println("Division is: "+(a/b));//ArithmeticException
		}catch(ArithmeticException v)
		{
			System.out.println("Provide number other than 0,0 is invalid number");
		}
		System.out.println("Multiplication is: "+(a*b));
		
		sc.close();


	}

}
