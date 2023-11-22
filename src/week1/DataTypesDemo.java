package week1;

public class DataTypesDemo {

	public static void main(String[] args)
	{
		//Primitive
		
		//boolean true/false size 1bit
		boolean status=true;
		System.out.println("Boolean data is: "+status);//true
		status=false;
		System.out.println("updated boolean data is: "+status);
		
		boolean newStatus=true;
		System.out.println("New status is: "+newStatus);
		
		System.out.println("***********Numeric**********");
		
		/*
		 * character(Numeric)
		 * 1.single character
		 * 2.special character
		 * 3.Ascii values
		 * size: 2byte
		 * 
		 * A to Z= 65 to 90
		 * a to z= 97 to 122
		 * 0 to 9= 48 to 57  
		 */
		char c1='A';
		System.out.println("Character data is: "+c1);
		char c2='$';
		System.out.println("Special character is: "+c2);
		//ASCII
		
		char c3=90;//90 as AScii value for character
		System.out.println("Character for AScii 90: "+c3);
		
		char c4=68;
		System.out.println(c4);//D
		
		System.out.println("****************");
		
		//Numeric--->integral--->integer and floating point
		
		//Integer byte(1byte)-->short(2byte)--->int(default 4byte)-->long(8byte)
		
		//byte 1byte -128 to 127
		byte b1=120;
		System.out.println("byte data is: "+b1);//120
		//byte b2=-129;//Type mismatch: cannot convert from int to byte
		
		byte b2=-127;
		System.out.println("byte data is: "+b2);//-127
		
		//short 2byte -32768 to 32767
		
		short s1=15000;
		System.out.println("Short data is: "+s1);
		
		short s2=-30000;
		System.out.println("Short data is: "+s2);
		
		//short s3=50000;//Type mismatch: cannot convert from int to short
		
		//int 4byte 
		int i1=50000;
		System.out.println("integer data is: "+i1);
		
		//int i2=9999999999;//The literal 9999999999 of type int is out of range 
		
		//long 8byte
		
		long l1=9999999999L;
		System.out.println("Long data is: "+l1);
		
		System.out.println("**************Floating point*******");
		
		//float 4byte     double 8byte (default)
		
		
		double d1=89.787;
		
		System.out.println("Double data is: "+d1);
		
		
		float f1=67.45F;
		System.out.println("float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
