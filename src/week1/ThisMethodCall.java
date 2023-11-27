package week1;

public class ThisMethodCall
{
	
	public void m1()
	{
		System.out.println("M1 is calling.....");
		//this.m2();
	}
	
	public void m2()
	{
		//To call instance variable/method
		System.out.println("M2 is calling.....");
		this.m1();
	}

	public static void main(String[] args)
	{
		ThisMethodCall t1=new ThisMethodCall();
		//t1.m1();
		t1.m2();

	}

}
