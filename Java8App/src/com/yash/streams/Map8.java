package com.yash.streams;
import java.util.HashMap;
import java.util.Map;
public class Map8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"Sabbir");
		map.put(2, "Amit");
		map.put(3, "Sumeet");
		map.put(4, "Rohit");
		
		map.putIfAbsent(5, "No Name");
		System.out.println(map);
		
		map.putIfAbsent(4, "Rakesh");
		System.out.println(map);
		
		map.computeIfPresent(1, (key,value)->key+value);
		System.out.println(map);
		
		System.out.println(map.getOrDefault(42, "not found"));  // not found
		
		map.merge(4, "Patel",(value,newValue)->value+newValue);
	
		System.out.println(map);
	}

}
