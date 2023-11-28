package week1;

public class ThisWithConstructorCall 
{
	public ThisWithConstructorCall()
	{
		//this(101);//calling pC
		System.out.println("Default constructor is calling!");
		
	}
	
	public ThisWithConstructorCall(int id)
	{
		this();
		System.out.println("Parmeterized constructor is calling!: "+id);
	}
	

	public static void main(String[] args)
	{
		//ThisWithConstructorCall t1=new ThisWithConstructorCall();
		
		ThisWithConstructorCall t2=new ThisWithConstructorCall(101);
		


	}

}
