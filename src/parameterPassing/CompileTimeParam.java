package parameterPassing;

public class CompileTimeParam 
{
	//method without parameter
	public void add()//0 parameter method
	{
		int a=100,b=30;//local 
		System.out.println("Addition is: "+(a+b));
	}

	
	//method with parameter without return
	public void sub(int a,int b)//2 parameter a,b are local variable
	{
		System.out.println("Subtraction is: "+(a-b));
		
	}
	
	
	//method with parameter with return keyword
	/*
	 * return keyword return data/result from method to calling function/method
	 * return type of method should be change
	 */
	
	
	public int mul(int a,int b)
	{
		return a*b;
		
	}
	
	public String info(String msg)
	{
		return msg;
	}
	
	
	public static void main(String[] args) 
	{

		CompileTimeParam c1=new CompileTimeParam();
		c1.add();
		
		//compile time parameter passing without return
		c1.sub(70,50);
		
		System.out.println(c1.mul(20,20));
		//or
		int result=c1.mul(10,10);
		System.out.println("Multiplication result is: "+result);
		
		String data=c1.info("Hello All");
		System.out.println("Message is: "+data);

	}

}
