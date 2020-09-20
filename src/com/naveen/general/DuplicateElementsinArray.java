package com.naveen.general;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsinArray 
{

	public static void main(String[] args) 
	{
	  String names[] = {"Java","JavaScript","Python","Ruby","C","Java","Python"};
	  
	  //1. Compare each element: O(nxn) --> Worst Solution
	  for(int i=0; i<names.length; i++)
	  {
		  for(int j=i+1; j<names.length; j++)
		  {
			  if(names[i].equals(names[j]))
			  {
				  System.out.println("Duplicate element is: "+names[i]);
			  }
		  }
	  }
	  
	  System.out.println("===============================");
	 
	  //2. Using HashSet: O(n)
	  
	  Set<String> set = new HashSet<>();
	  for(String str : names)
	  {
		  if(set.add(str) == false)
		  {
			  System.out.println("Duplicate element is:  "+str);
		  }
	  }
	  
	  System.out.println("===============================");
	  
	  
	  //3. Using HashMap
	  
	  Map<String, Integer> map = new HashMap<>();
	  
	  for(String name : names)
	  {
		  Integer count = map.get(name);
		  
		  if(count == null)
		  {
			  map.put(name, 1);
		  }
		  else
		  {
			  map.put(name, ++count);
		  }
	  }
	  
	  Set<Entry<String,Integer>> entrySet = map.entrySet();
	  
	  for(Entry<String,Integer> entry : entrySet)
	  {
		  if(entry.getValue() > 1)
		  {
			  System.out.println("Duplicate element is: "+entry.getKey());
		  }
	  }
	  
	  
	  System.out.println("===============================");
	  
	  
	  Set<String> keys = map.keySet();
	  
	  for(String c1 : keys)
	  {
		  if(map.get(c1) > 1)
		  {
			  System.out.println(c1 + " is present: " +map.get(c1) + " times");
		  }
	  }
	  
	}

}
