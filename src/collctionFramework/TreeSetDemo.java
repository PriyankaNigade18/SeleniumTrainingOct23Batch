package collctionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * TreeSet is class implement SortedSet interface
	 * Underline data structure is Search Tree
	 * return all elements in sorted order
	 */
	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(3);
		ts.add(11);
		ts.add(4);
		ts.add(9);
		ts.add(2);
		ts.add(1);
		ts.add(13);
		ts.add(8);
		
		
		System.out.println(ts);
		
		System.out.println("Total Elements are: "+ts.size());
		
		
		System.out.println(ts.descendingSet());
		
		System.out.println("headSet returns less than element: "+ts.headSet(10));
		
		System.out.println("tailSet return greater than and equal to: "+ts.tailSet(10));
		
		System.out.println("subSet between and including from number: "+ts.subSet(4,10));
		
		System.out.println(ts.first());//1
		System.out.println(ts.last());//13
		
		
		
		

	}

}
