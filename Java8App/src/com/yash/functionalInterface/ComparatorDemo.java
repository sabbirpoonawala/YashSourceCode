package com.yash.functionalInterface;

import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String> comparator1=(s1,s2)->s1.compareTo(s2);
		System.out.println(comparator1.compare("Hello", "hello"));
		
	   System.out.println(comparator1.reversed().compare("Hello", "hello"));
		

	}

}
