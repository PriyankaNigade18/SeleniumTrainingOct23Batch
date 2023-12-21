package oop.Encapsulation;

import oop.Inheritance.AccessModifier;
public class DifferentClassPackage extends AccessModifier
{

	public static void main(String[] args) 
	{
		//outside class in different package
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.name);
		
		//protected can accessed only with child class
		
		DifferentClassPackage d1=new DifferentClassPackage();
		System.out.println(d1.name);
		System.out.println(d1.acno);
		
		
		

	}

}
