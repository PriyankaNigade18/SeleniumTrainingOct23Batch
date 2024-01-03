package collctionFramework;

import java.util.ArrayList;

public class ArrayListDemo3 {


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
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println(a);
		
		System.out.println("********************");
		
		ArrayList<String> location=new ArrayList<String>();
		location.add("Pune");
		location.add("Satara");
		location.add("Mumbai");
		
		System.out.println(location);
		
		System.out.println("********************");

		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(23.89);
		marks.add(34.67);
		
		System.out.println(marks);
		System.out.println(marks.size());
		
		System.out.println("********************");
		
		
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add(101);
		empdata.add("Sarang");
		empdata.add("Pune");
		empdata.add('M');
		empdata.add(8797558999L);
		empdata.add(56.78);
		
		
		System.out.println(empdata);

		System.out.println(empdata.contains("Pune"));
		
		
		
		

	}

}
