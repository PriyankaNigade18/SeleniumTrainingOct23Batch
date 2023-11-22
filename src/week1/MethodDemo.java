package week1;

public class MethodDemo 
{
	/*
	 * Instance variable and method we can call using Object
	 * Instance variable and method get sepearate memory for every different object
	 * 
	 *  Static variable and method get the memory only one time
	 *  we can call static variable and method with and without class name
	 *  
	 */
	
	public void accept()
	{
		System.out.println("This is instance method");
	}
	
	
	public static void display()
	{
		System.out.println("This is static method");
	}
	
	

	public static void main(String[] args) 
	{
		//call
		display();
		MethodDemo.display();
		
		MethodDemo m1=new MethodDemo();
		
			m1.accept();
		
		


	}

}
