package week1;

public class StudentData
{
	//data
	int id;
	String name;
	
	//method
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student Name is: "+name);
	}
	
	
	public static void main(String args[])
	{
		//object
		StudentData s1=new StudentData();
		s1.id=101;
		s1.name="Nikhita";
		s1.show();
		System.out.println("************************");
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Priti";
		s2.show();
		System.out.println("************************");
		StudentData s3=new StudentData();
		s3.id=103;
		s3.name="Abhijeet";
		s3.show();
		
	}

}
