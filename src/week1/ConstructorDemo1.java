package week1;

public class ConstructorDemo1 
{
	//instance variable
	int id;
	String name;
	
	//default constructor
	public ConstructorDemo1()
	{
		System.out.println("Default constructor is calling");
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}
	//parameterized constructor
	public ConstructorDemo1(int i,String n)//parameters i, n local
	{
		//initialize instance variable
		id=i;
		name=n;
		System.out.println("Parameterized constructor is calling!");
		System.out.println("Id is: "+id+" & name is: "+name);
		
	}
	public static void main(String[] args)
	{
		//object 
		
		//MethodDemo.display();
		
		ConstructorDemo1 c1=new ConstructorDemo1();
		
		ConstructorDemo1 c2=new ConstructorDemo1(201,"Parag");
		/*
		 * when you are passing real data then it is called Argument
		 * when you are passing variable then it is called parameter

		 */
		
		
		
		
		
		

	}

}
