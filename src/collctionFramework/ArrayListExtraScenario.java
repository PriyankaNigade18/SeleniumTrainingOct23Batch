package collctionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExtraScenario {

	public static void main(String[] args)
	{
		/*
		 * Arrays class contains asList()
		 */

		List<Integer> list1=Arrays.asList(10,20,30,40);
		System.out.println("List1: "+list1);
		
		List<Integer> list2=Arrays.asList(50,60,70);
		System.out.println("List2: "+list2);
		
		
		//to create new list
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println("List3: "+list3);
		
		ArrayList<Integer> list4=new ArrayList<Integer>(list1);
		System.out.println(list4);
		list4.addAll(list2);
		
		System.out.println(list4);
		
		
		
		
		
		
		
		
		
	}

}
