package week1;

public class VariableDemo
{
	
	//data
	int id=101;//instance variable
	static String cname="AISSPMS";
	
	//function
	public void show()
	{
		int marks=90;//local variable
		System.out.println("Marks from show():"+marks );
		System.out.println("Id is: "+id);
		System.out.println("Collage nameis: "+cname);
	}
	

	public static void main(String[] args)
	{
		System.out.println("Collage nameis: "+cname);
		VariableDemo v1=new VariableDemo();
		System.out.println("Student id is: "+v1.id);
		int marks=100;//local variable
		System.out.println("Marks from main(): "+marks);
		
	
		v1.show();
		

	}

}
