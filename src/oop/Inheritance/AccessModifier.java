package oop.Inheritance;

public class AccessModifier
{
			int id=101;//default
	public String name="Sarang";
	private long phno=9797976559L;
	protected int acno=658655;
	

	public static void main(String[] args)
	{
		//same class 

		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);

	}

}
