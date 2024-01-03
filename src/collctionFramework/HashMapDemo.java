package collctionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo
{	
	/*
	 * HashMap is class implements Map interface
	 * Underline data structure is HashTable
	 * <Key,Value>
	 * What is Entry in Map?
	 * Entry is interface in map 
	 * 
	 */

	public static void main(String[] args)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("VimanNagar", 411014);
		hm.put("Lohegaon", 411047);
		hm.put("WadgaonSheri",411014);
		hm.put("Kharadi",411015);
		
		System.out.println("Total Elements: "+hm.size());
		
		System.out.println(hm);
		
		System.out.println("Value for Kharadi: "+hm.get("Kharadi"));
		
		hm.put("Kharadi",411016);
		
		System.out.println(hm);
		
		System.out.println("Iteration of Map using Entry interface");
		/*
		 * Entry is interface in Map
		 */
		
		//for each
		
		for(Map.Entry<String,Integer> i:hm.entrySet())//key value
		{
			//System.out.println(i);
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		
		System.out.println("***********iterator()*************");
		//map into set--->iterator
		
		Set<Entry<String,Integer>> set=hm.entrySet();
		Iterator<Entry<String,Integer>> ir=set.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		

	}

}
