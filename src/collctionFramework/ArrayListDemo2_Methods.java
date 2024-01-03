package collctionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2_Methods {

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
		System.out.println("Is list is empty?: "+al.isEmpty());//true
		al.add(10);
		al.add(20);
		al.add(67);
		al.add(15);
		al.add(30);
		al.add(20);
		al.add(40);
		System.out.println("After adding elements is list empty?: "+al.isEmpty());
		System.out.println("Total elements are: "+al.size());
		System.out.println("Is 50 available?: "+al.contains(50));
		System.out.println("Is 10 available?: "+al.contains(10));
		
		//remove 
		//al.remove(2);//30
		System.out.println(al);
		
		//add element at 2 position 30
		al.add(2,30);
		System.out.println(al);
		
		//clear the list
		//al.clear();
		System.out.println(al);//empty list
		System.out.println(al.size());//0
		
		/*
		 * Collections class contains all static method 
		 * sort()-list
		 */
		//sort the list
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		

		
		
		
		

	}

}
