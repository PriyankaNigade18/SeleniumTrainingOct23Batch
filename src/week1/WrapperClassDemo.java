package week1;

public class WrapperClassDemo {

	public static void main(String[] args) 
	{
		//Object to primitive
		
		String s1="100";
		System.out.println(s1+100);//100100
		//string to int
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		String s2="51.77";
		System.out.println(s2+11.11);//51.7711.11
		//string to double
		double d1=Double.parseDouble(s2);
		System.out.println(d1+11.11);//62.88
		
		
		String s3="A";
		//string to character
		
		
		
		
		
		
		
		
		
	}

}
