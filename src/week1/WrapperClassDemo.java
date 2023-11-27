package week1;

public class WrapperClassDemo {

	public static void main(String[] args) 
	{
		//Object to primitive- Wrapper class
		
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
		
		
		String s3="125";//byte -128 to 127
		System.out.println(s3+2);//1252
		//string ----Byte
		byte data=Byte.parseByte(s3);
		System.out.println(data+2);
		
		/*
		 * String is class and is collection of characters
		 * to get character from string use charAt(index)
		 * index= starts with 0
		 */
		String s4="Amit";
		//string to character
		char ch=s4.charAt(0);//A
		System.out.println(ch);
		
		System.out.println("*****************");
		//primitive to Object
		
		int n1=80;
		System.out.println(n1+100);//180
		//int to String
		String ss1=String.valueOf(n1);
		System.out.println(ss1+100);//80100
		
		//double
		double d2=67.88;
		String ss2=String.valueOf(d2);
		System.out.println(ss2+100);
		
		//long
		long l1=9998989889L;
		String ss3=String.valueOf(l1);
		System.out.println(ss3+100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
