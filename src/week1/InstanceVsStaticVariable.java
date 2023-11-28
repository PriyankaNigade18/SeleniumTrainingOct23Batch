package week1;

public class InstanceVsStaticVariable
{
	//instance
	//int count=1;
	static int count=1;

	public InstanceVsStaticVariable()
	{
		System.out.println(count);
		count++;
	}
	
	public static void main(String[] args) 
	{

		InstanceVsStaticVariable i1=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i2=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i3=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i4=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i5=new InstanceVsStaticVariable();
	}

}
