package oop.Polymorphism;

public class CompileTimePoly
{
	/*
	 * Overloading is compile time polymorphism in java
	 * Overloading belongs to the same class
	 * Method overloading is possible
	 * Constructor overloading is possible
	 * Main() overloading is possible
	 * Operating overloading is for only one operator(+)
	 * 
	 * Method can be overloaded only when method has same name and differnt signatur
	 * 1.Number of Arguments
	 * 2.Type of Arguments
	 * 3.Change the Order of Arguments
	 */


	public void add()
	{
		int a=10,b=20;
		System.out.println("Addition iS: "+(a+b));
		
	}
	//1.Number of Arguments
	public void add(int a,int b)//2 parameters
	{
		System.out.println("Addition iS: "+(a+b));
	
	}

	public void add(int a,int b,int c)
	{
		System.out.println("Addition iS: "+(a+b+c));
	
	}
	//2.type of arguments
	public void add(double a,int b)//2 parameter
	{
		System.out.println("Addition iS: "+(a+b));
	
	}
	//3.change order of arguments
	public void add(int a,double b)//2 parameter
	{
		System.out.println("Addition iS: "+(a+b));
	
	}
	
	//Constructor Overloading
	public CompileTimePoly()
	{
		System.out.println("This is default costructor");
	}
	
	public CompileTimePoly(int id)
	{
		System.out.println("This is parameterized costructor id: "+id);
	}
	
	public CompileTimePoly(int id,String name)
	{
		System.out.println("This is parameterized costructor id: "+id+" name is: "+name);
	}
	
	public CompileTimePoly(String name,int id)
	{
		System.out.println("This is parameterized costructor id: "+id+" name is: "+name);
	}
	public static void main(String[] args)
	{
		CompileTimePoly p1=new CompileTimePoly(89);
		p1.add();
		p1.add(200.11, 100);
		p1.add(300,200.89);
		p1.add(100,2000);
		p1.add(10,20,30);
		
		CompileTimePoly p2=new CompileTimePoly(101);
		
		CompileTimePoly p3=new CompileTimePoly(201,"Parag");
		
	
	}

}
