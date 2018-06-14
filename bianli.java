package com.xk.jihe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BianLi {

	public static void main(String[] args) {
		/*
		 * 数组的遍历
		 * */
		int[] a= {1,2,3,4,5};
		//for循环遍历
		for(int i=0;i<a.length;i++){
			if(i<a.length-1) {
				System.out.print(a[i]+",");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.println(" ");
		
		
		//增强for循环遍历
		for(int i:a){
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		/*
		 * list的遍历
		 * */
		List<Object> b=new ArrayList<>();
		b.add("a");
		b.add("b");
		b.add("c");
		for(int i=0;i<b.size();i++){
			System.out.print(b.get(i)+" ");
		}
		System.out.println(" ");
		
		//增强for循环遍历
		for(Object i:b){
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		//迭代
		Iterator<Object> i=b.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println(" ");
		
		/*
		 * map的遍历
		 * */
		Map<String, String> c=new HashMap<>();
		c.put("1", "Hollo");
		c.put("2", "World");
		
		//拿到key值遍历
		for(Object f:c.keySet()){
			System.out.print(f + " ");
		}
		System.out.println(" ");
		
		//拿到values值遍历
		for(Object f:c.values()){
			System.out.print(f + " ");
		}
		System.out.println(" ");
		
		//迭代key
		Set<String> sk = c.keySet(); 
		Iterator<String> iterator = sk.iterator();  
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(" ");
		
		//for一次遍历出key和values
		for (Iterator i1 = c.keySet().iterator(); i1.hasNext();) {  
			 Object obj = i1.next();  
			 System.out.println("key=" + obj + " value=" + c.get(obj));  
		}  
		System.out.println(" ");
		//增强for一次遍历出key和values
		for (Entry<String, String> entry : c.entrySet()) {  
			String key = entry.getKey().toString();  
			String value = entry.getValue().toString();  
			System.out.println("key=" + key + " value=" + value);  
		}
		
	}

}
