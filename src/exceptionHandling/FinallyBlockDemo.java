package exceptionHandling;

public class FinallyBlockDemo {

	public static void main(String[] args) 
	{

		System.out.println("Program started.......");
		try {
		System.out.println(9/0);
		}catch(Exception e)
		{
			System.out.println("0 is invalid number!");
		}
		finally
		{	System.out.println("**********Finally block execution*******");
			System.out.println("Stable or to execute any special code with or with exception");
		}
		System.out.println("Program stoped.......");

	}

}
