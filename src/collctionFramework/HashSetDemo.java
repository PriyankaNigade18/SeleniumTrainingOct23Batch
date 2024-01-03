package collctionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	/*
	 * HashSet is class extends AstractSet which implement Set interface
	 * Underline data structure is HashTable where data inserted as per hash function
	 * It is not ordered and duplication is not allowed
	 * Initial capacity is 16 virtual segment
	 * It maintains data as per node structure
	 * |key|hash code|data|address of next element|
	 * hash code and index for null is always 0
	 */
	public static void main(String[] args)
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Is set empty: "+hs.isEmpty());
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(null);
		
		System.out.println("After adding elements status is: "+hs.isEmpty());
		
		System.out.println(hs);
		
		System.out.println("Total elements: "+hs.size());
		
		System.out.println("Is 50 available?: "+hs.contains(50));//false
		
		
		System.out.println("Is 10 available?: "+hs.contains(10));//true
		
		hs.remove(null);
		
		System.out.println(hs);
		
		System.out.println("*****************for each************");
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		System.out.println("*****************iterator()************");

		Iterator<Integer> ir=hs.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
