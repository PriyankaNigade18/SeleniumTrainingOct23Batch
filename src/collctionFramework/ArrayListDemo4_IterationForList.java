package collctionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4_IterationForList {

	/*
	 * ArrayList is class implements List interface
	 * underline data structure is Dynamic array
	 * It non Synchronized class
	 * ArryList is ordered collection based on indexing
	 * ArrayList allowed duplication
	 * Internally ArrayList create 10 virtual segment
	 * add(),get(),isEmpty(),size(),contains(),clear(),remove()
	 *  
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		System.out.println("*********Using for loop***********");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("*********Using for-each loop***********");
		
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		System.out.println("*********Using iterator()***********");

		/*
		 * iterator() is available in Iterable Interface
		 * this method returns Iterator Interface object.
		 * Using Object we can use two methods 
		 * 1.hasNext()-check whether list contains any element
		 * 2.next()-get the element and it will increment the counter
		 */
		
		Iterator<Integer> ir=al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		


	}

}
