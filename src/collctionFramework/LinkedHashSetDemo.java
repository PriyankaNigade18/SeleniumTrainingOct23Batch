package collctionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	/*
	 * LinkedHashSet extends HashSet class  implements Set interface
	 * Underline data structure is Doubly LinkedList
	 * It contains features of List and Set
	 * It is Ordered
	 * It maintains unique elements
	 * 
	 */
	
	public static void main(String[] args)
	{

		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		ls.add(20);
		
		
		System.out.println(ls);
		
		System.out.println(ls.size());
		
		System.out.println(ls.isEmpty());
		
		
		//remove duplicate characters
		
		String s1="aabbccdd";
		System.out.println(s1);
		
		
		LinkedHashSet<Character> lc=new LinkedHashSet<Character>();
		
		for(int i=0;i<s1.length();i++)
		{
			lc.add(s1.charAt(i));
		}
		
		System.out.println(lc);
		
		

	}

}
