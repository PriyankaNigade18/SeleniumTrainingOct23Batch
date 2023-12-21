package oop.Inheritance;


//final class Demo
class Demo
{
	
	final int id=101;
	
	public final void color()
	{
		System.out.println("Red");
	}
}

//The type FinalKeyword cannot subclass the final class Demo
public class FinalKeyword  extends Demo
 {
	//@Override//Cannot override the final method from Demo
//	public void color()
//	{
//		System.out.println("Blue");
//	}

	public static void main(String[] args)
	{

		FinalKeyword  f1=new FinalKeyword ();
		//f1.id=201;//The final field Demo.id cannot be assigned
		System.out.println(f1.id);
		f1.color();
		

	}

}
