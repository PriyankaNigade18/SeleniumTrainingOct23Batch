package oop.Inheritance;

public class SuperChild extends SuperParent 
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent Id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child id is: "+cid);
		System.out.println("Child income is: $9000");
	}

	public SuperChild()
	{
		super();
		System.out.println("This is child constructor");
	}
	public static void main(String[] args)
	{
		SuperChild c1=new SuperChild();
		c1.childIncome();
		


	}

}
