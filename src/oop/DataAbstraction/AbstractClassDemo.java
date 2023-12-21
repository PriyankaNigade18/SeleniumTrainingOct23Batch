package oop.DataAbstraction;

public abstract class AbstractClassDemo
{	/*
	 * 
	 * Abstract class contains implemented and abstract methods
	 * Needs child class to implement abstract method
	 * For Abstract class we can't create Object
	 * Using Abstract class partial abstraction is possible
	 * 	 
	 * */
	
	//Implemented
	public void accept()
	{
		System.out.println("Accept() implemented method");
	}
		//Non Implemented(abstract)
	public abstract void show();
	
	
	
	public static void main(String args[])
	{
		//Cannot instantiate the type AbstractClassDemo
		//AbstractClassDemo a1=new AbstractClassDemo();
		
	}
	
}
