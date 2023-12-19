package oop.Inheritance;


class A
{
	public void m1()
	{
		System.out.println("This is m1() Calling! ");
	}
}

class B extends A//A is parent of B -Single level Inheritance
{
	public void m2()
	{
		System.out.println("This is m2() Calling! ");
	}
}
class C extends B//B is parent of C- Multilevel inheritance
{
	public void m3()
	{
		System.out.println("This is m3() calling!");
	}
}
class D extends A//A is parent of D- Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("This is m4() calling!");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) 
	{
			System.out.println("Scenario1: Child class ref and child class object");
//			B b1=new B();
//			b1.m1();
//			b1.m2();
			
//			C c1=new C();
//			c1.m1();
//			c1.m2();
//			c1.m3();
			
			D d1=new D();
			d1.m1();
			d1.m4();
			
			
			System.out.println("Scenario2: parent class ref and parent class object");

			A a1=new A();
			a1.m1();
			
			// for c parent is B
//			B b1=new B();
//			b1.m1();
//			b1.m2();
			
			System.out.println("Scenario3: parent class ref and Child class object");

//			A a2=new B();
//			a2.m1();
			
//			B b2=new C();
//			b2.m1();
//			b2.m2();
			
			A a2=new D();
			a2.m1();
			
			System.out.println("Scenario4: Invalid -child class ref and parent object ");
			//B b2=new A();//Type mismatch: cannot convert from A to B
			
			
			
			
			
	}

}
