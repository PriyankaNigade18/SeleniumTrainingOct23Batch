package week1;

public class TypeCasting {

	public static void main(String[] args) 
	{
		// primitive to primitive
		
		//1.Implicit automatic conversion ---JVM[small size to large size]
		//byte-->char-->short-->int--->long--->float--->double

		byte b=120;
		
		int a=b;
		
		System.out.println("byte to int data is: "+a);
		
		char c='P';//2byte
		int d=c;//4byte
		
		System.out.println("char to int data is: "+d);
		
		
		int x=987678;//4byte
		
		float f1=x;//4byte
		System.out.println("int to float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
