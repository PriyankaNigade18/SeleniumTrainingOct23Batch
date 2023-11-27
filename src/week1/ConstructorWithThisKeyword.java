package week1;

public class ConstructorWithThisKeyword
{
	/* this keyword
	 * =================
	 * To refer current class instance variable and instance method
	 * To call instance variable/method
	 * To call constructor - this() this constructor
	 * To differentiate instance variable and local variable 
	 * 
	 */
	
	//instance
	int id;
	String name;
	
	public ConstructorWithThisKeyword(int id,String name)//local
	{
//		id=id;
//		name=name;
		
		//To differentiate instance variable and local variable 
		//assigning the data to instance variable
		this.id=id;
		this.name=name;
		
		
		
	}
	
	public void show()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}

	public static void main(String[] args)
	{

		ConstructorWithThisKeyword c1=new ConstructorWithThisKeyword(101,"Neha");
		c1.show();
		

	}

}
