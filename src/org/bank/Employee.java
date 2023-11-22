package org.bank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Employee {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		
		m.put("csk", 10);
		m.put("mi", 9);
		m.put("rr", 8);
		m.put("rcb", 10);
		m.put("kkr", 7);
		m.put(null, null);
		m.put("dd", null);
		m.put(null, 5);
		
		System.out.println(m);
		
		Map<String,Integer> m1=new LinkedHashMap();
		
		m1.put("csk", 10);
		m1.put("mi", 9);
		m1.put("rr", 8);
		m1.put("rcb", 10);
		m1.put("kkr", 7);
		m1.put(null, null);
		m1.put("dd", null);
		m1.put(null, 5);
		System.out.println(m1);
		
		Map<String,Integer> m2=new TreeMap();
		
		m2.put("csk", 10);
		m2.put("mi", 9);
		m2.put("rr", 8);
		m2.put("rcb", 10);
		m2.put("kkr", null);
		m2.put("dd", 6);
		System.out.println(m2);
		
		Map<String,Integer> m3=new Hashtable();
		
		m3.put("csk", 10);
		m3.put("mi", 9);
		m3.put("rr", 8);
		m3.put("rcb", 10);
		m3.put("kkr", 7);
		m3.put("dd", 6);
		System.out.println(m3);
		
		int size = m3.size();
		System.out.println(size);
		
		boolean containsKey = m3.containsKey(10);
		System.out.println(containsKey);
		
		boolean containsKey2 = m3.containsKey("mi");
		System.out.println(containsKey2);
		
		Set<String> keySet = m3.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = m3.values();
		System.out.println(values);
		
		Set<Entry<String, Integer>>  c= m3.entrySet();
		for(Entry<String, Integer> b:c) {
		System.out.println(c);
		System.out.println("work as assigned");
		System.out.println("done by hris");
	}
	
}}
