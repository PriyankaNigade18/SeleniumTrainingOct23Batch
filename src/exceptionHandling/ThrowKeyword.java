package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws StringIsNullException
	{

		String s1=null;
		
		if(s1==null)
		{ 
			System.out.println("Exception handled!");
			throw new StringIsNullException();
			
		}

	}

}
