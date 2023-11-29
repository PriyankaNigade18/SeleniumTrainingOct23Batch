package parameterPassing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInputFromUser {

	public static void main(String[] args) throws IOException
	{
		//Scanner class
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter your gender(M/F)");
		//String--->charAt(index)-->char
		String data=sc.nextLine();
		char gen=data.charAt(0);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Hello "+name);
		System.out.println("Your age is : "+age+" & gender is: "+gen);
		
		sc.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
		/*
		//BufferedReader class
		
		System.out.println("Enter your age:");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();//-->int
		
		int age=Integer.parseInt(data);
		System.out.println(age);
		
		
		
		
		/*
		//technique 1: 
		System.out.println("Enter your age:");
		
		//input stream 
		int age=System.in.read();//char-->int
		
		System.out.println((char)age);
		*/

	}

}
