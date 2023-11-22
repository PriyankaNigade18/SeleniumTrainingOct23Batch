package week1;

public class AccessModifierDemo
{
	//data
	int id=101;//default
	public String name="Sarang";
	private int phno=8989900;
	
	public static void main(String[] args)
	{
		//calling from same class
		AccessModifierDemo a1=new AccessModifierDemo();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);

	}

}
