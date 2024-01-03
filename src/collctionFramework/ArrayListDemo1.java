package collctionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {
	/*
	 * ArrayList is class implements List interface
	 * underline data structure is Dynamic array
	 * It non Synchronized class
	 * ArryList is ordered collection based on indexing
	 * ArrayList allowed duplication
	 * Internally ArrayList create 10 virtual segment
	 * frequent operation is data retrieval
	 *  
	 */
	public static void main(String[] args)
	{
		
		
		/*
		 * Generic way-type safe and type casting is not required
		 * 
		 */
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(200);
		
		System.out.println(al);
		
		int num=al.get(0);
		System.out.println(num);
		
		/*
		 *  1.Non Generic
		 *  It is not type safe 
		 *  Type casting
		 *  
		 

		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Sarang");
		al.add(67.78);
		al.add('M');
		
		System.out.println(al);
		
		int num=(int) al.get(0);
		System.out.println(num);
		*/
	}

}
