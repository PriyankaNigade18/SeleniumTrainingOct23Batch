package collctionFramework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args)
	{

		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Is list empty?: "+v1.isEmpty());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(20);
		System.out.println("After adding elements status is: "+v1.isEmpty());
		
		System.out.println("Totle elements: "+v1.size());
		
		System.out.println(v1);
		
		System.out.println(v1.contains(100));//false
		System.out.println(v1.contains(30));//true
		
		v1.remove(0);
		
		System.out.println(v1);
		
		

	}

}
