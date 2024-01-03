package collctionFramework;

import java.util.LinkedList;

public class LinkedListDemo {

	/*
	 * LinkedList is class implements List interface
	 * underline data structure is Doubly LinkedList
	 * Frequent operation is data insertion and deletion
	 * 
	 */
	public static void main(String[] args)
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		if(l1.isEmpty())
		{
			l1.add(10);
			l1.add(20);
			l1.add(30);
			l1.add(30);
			l1.add(null);
			l1.add(40);
			
		}

		System.out.println("Is list empty: "+l1.isEmpty());//false
		System.out.println("Total elements are: "+l1.size());
		System.out.println(l1);
		
		l1.remove(4);//null
		System.out.println(l1);
		
		System.out.println("20?: "+l1.contains(20));
		System.out.println("200?: "+l1.contains(200));
		
		//extra methods
		l1.addFirst(100);

		l1.addLast(200);
		
		System.out.println(l1);
		
		l1.add(4,90);
		
		System.out.println(l1);
		
		System.out.println(l1.getFirst()+" : "+l1.getLast());
		
		System.out.println("*********************");
		
		
		
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		
		
	}
	
	
	
	
	
	

}
