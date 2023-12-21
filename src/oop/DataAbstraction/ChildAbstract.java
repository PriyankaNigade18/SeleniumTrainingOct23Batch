package oop.DataAbstraction;

public class ChildAbstract extends AbstractClassDemo
{
	public void sample()//individual
	{
		System.out.println("This is child class method");
	}
	
	@Override
	public void show()//inherited abstract method 
	{

		System.out.println("Show() implemented by child class");
		
	}
	public static void main(String[] args) 
	{
		
		//Scenario1: Child class ref and child class Object
		ChildAbstract c1=new ChildAbstract();
		c1.sample();//individual
		c1.accept();//inherited
		c1.show();//inherited abstract 
		
		
		System.out.println("*****************");
		//Scenario 2: Parent class ref and Child class Object
		
		//AbstractClassDemo a1=new AbstractClassDemo();
		
		AbstractClassDemo a1=new ChildAbstract();
		a1.accept();
		a1.show();
		
		
		
		
		
		
		

	}

	

}
