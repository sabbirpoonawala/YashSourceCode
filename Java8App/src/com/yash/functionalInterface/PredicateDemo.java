package com.yash.functionalInterface;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> predicateString=(s)->s.length()>6;
		System.out.println(predicateString.test("sabbir"));
		
		System.out.println(predicateString.negate().test("sabbir"));
		
		Predicate<String> predicateIsEmpty=String::isEmpty;
		System.out.println(predicateIsEmpty.test(""));
		
		Predicate<Object> predicateObject=Objects::isNull;
		Boolean b=null;
		System.out.println(predicateObject.test(b));
		
		Predicate<Object> predicateNonNull=Objects::nonNull;
		System.out.println(predicateNonNull.test(b));	
		
        boolean objectTest1=Objects.deepEquals(Arrays.asList("1001","1002"), Arrays.asList("1001","1002"));		
		System.out.println(objectTest1);
		
        boolean objectTest2=Objects.deepEquals(Arrays.asList("1001","1002"), Arrays.asList(new String[] {"1001","1002"}));	
        System.out.println(objectTest2);

        boolean objectTest3=Objects.deepEquals(10, new Integer(10));
        System.out.println(objectTest3);
        
	}
}
