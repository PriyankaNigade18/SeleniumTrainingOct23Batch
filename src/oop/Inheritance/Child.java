package oop.Inheritance;

public class Child extends Parent
{
	
	@Override
	public void color()
	{
		System.out.println("Yellow");
	}
	
	public static void main(String[] args)
	{
		//child class ref and child class Object
		Child c1=new Child();
		c1.color();//yellow
		
		//parent class ref and parent class Object
		Parent p1=new Parent();
		p1.color();//red
		
		//parent ref and child object
		Parent p2=new Child();
		p2.color();//yellow
		
		
		
		
		
		
		
		

	}

}
