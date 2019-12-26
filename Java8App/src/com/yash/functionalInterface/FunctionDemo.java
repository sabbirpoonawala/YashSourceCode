package com.yash.functionalInterface;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> function1=Integer::valueOf;
		System.out.println(10+function1.apply("10"));
		
		Function<String,String> function2=function1.andThen(String::valueOf);
		System.out.println(10+function2.apply("10"));
		

	}

}
