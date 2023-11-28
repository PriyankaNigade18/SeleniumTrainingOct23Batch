package week1;

public class StaticBlockDemo 
{
	int id;
	String name;
	static String cname;
	
	//static block
	static
	{
		System.out.println("Static block is calling! ");
		System.out.println("Static block help to initialize static variable");
		cname="AISSPMS";
	}
	
	
	
	//constructor
	public StaticBlockDemo(int id,String name)
	{
		System.out.println("Constructor is calling! ");

		this.id=id;
		this.name=name;
		
	}
	
	//method
	public void show()
	{
		System.out.println("Method is calling");
		System.out.println("Student id is: "+id);
		System.out.println("student name is: "+name);
		System.out.println("Student collegename is: "+cname);
	}

	public static void main(String[] args) 
	{

		System.out.println("Main() is calling!");
		
		StaticBlockDemo s1=new StaticBlockDemo(101,"Neha");
		s1.show();
		
		

	}

}
