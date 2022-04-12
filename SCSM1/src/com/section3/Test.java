package com.section3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		Hashtable q=new Hashtable();
		q.put(120,"A");
		q.put(125,"B");
		q.put(110,"X");
		q.put(105,"Q");
		q.put(106,"Y");
		System.out.println(q);
	Set enteries=q.entrySet();
	Iterator itr=enteries.iterator();
	while (itr.hasNext())
	{
		Object obj=itr.next();
		Map.Entry m=(Map.Entry)obj;
		System.out.println(m.getKey());
		System.out.println(m.getValue());
		if(m.getValue().toString().equals("A"))
		{
			m.setValue("F");
		}
		
	}
		System.out.println(q);
	}

}

