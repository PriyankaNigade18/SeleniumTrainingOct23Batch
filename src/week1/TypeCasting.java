package week1;

public class TypeCasting {

	public static void main(String[] args) 
	{
		// primitive to primitive
		
		//1.Implicit automatic conversion ---JVM[small size to large size]
		//byte-->char-->short-->int--->long--->float--->double

		byte b=120;//1byte
		
		int a=b;//4byte
		
		System.out.println("byte to int data is: "+a);
		
		char c='A';//2byte
		int d=c;//4byte Ascii  value for A=65
		
		System.out.println("char to int data is: "+d);//65
		
		
		int x=987678;//4byte
		
		float f1=x;//4byte
		System.out.println("int to float data is: "+f1);
		
		
		long l1=x;
		System.out.println("int to long conversion: "+l1);
		
		System.out.println("***********************************");
		
		//2.Explicit type casting (large size to small size)
		//double-->float-->long-->int-->short-->char-->byte
		//casting operator (type)
		
		
		int y=122;//4byte
		char c2=(char)y;//2byte
		System.out.println("int to char conversion: "+c2);
		
		long l2=99999999999999L;//8byte
		int v=(int) l2;//4byte
		
		System.out.println("long to int conversion: "+v);
		
		double d1=78.888;
		int j=(int)d1;
		System.out.println("double to int: "+j);
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
