package com.yash.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.yash.entity.Employee;
public class StreamCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stringList=new ArrayList<>();
		stringList.add("sabbir");
		stringList.add("sabbir");
		stringList.add("amit");
		stringList.add("sumeet");
		stringList.add("chirag");
		
		Stream<String> stream=stringList.stream();
		long count=stream.count();
		System.out.println("Count:"+count);
		
		boolean allMatch=stringList.stream().allMatch((s)->s.startsWith("s"));
		System.out.println(allMatch);
		
		boolean anyMatch=stringList.stream().anyMatch((s)->s.startsWith("s"));
		System.out.println(anyMatch);
		
		Stream<String> filteredStream=stringList.stream().filter((s)->s.startsWith("s"));
		Stream<String> distinctString=filteredStream.distinct();
		distinctString.forEach(System.out::println);
		
		Optional<String> optionalFirst=stringList.stream().findFirst();
		System.out.println(optionalFirst.get());
		
		List<String> sortedList=stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Boolean> namesStartWithSList=stringList.stream().map((name)->name.startsWith("s")).collect(Collectors.toList());
		System.out.println(namesStartWithSList);
		
		
		Employee e1=new Employee();
		e1.setEmpId(1001);
		e1.setEmpName("sabbir");
		e1.setEmpSalary(45000);
		e1.setEmpDesignation("Trainer");
		
		Employee e2=new Employee();
		e2.setEmpId(1002);
		e2.setEmpName("amit");
		e2.setEmpSalary(15000);
		e2.setEmpDesignation("Trainer");
		
		Employee e3=new Employee();
		e3.setEmpId(1003);
		e3.setEmpName("rohit");
		e3.setEmpSalary(25000);
		e3.setEmpDesignation("Trainer");
		
		List<Employee> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		List<String> empNames=empList.stream().map(Employee::getEmpName).collect(Collectors.toList());
		empNames.forEach(System.out::println);
		
		
		String joined=empList.stream().map(Object::toString).collect(Collectors.joining(","));
		System.out.println(joined);
		
		ToDoubleFunction<Employee> function=(e)->e.getEmpSalary();
		
		double total = empList.stream().collect(Collectors.summingDouble((function)));
		System.out.println(total);
		
		List<String> names=new ArrayList<>();
		names.add("sabbir");
		names.add("poonawala");
		
		
		Optional<String> optionalNames=names.stream().reduce((s1,s2)->s1.concat(s2));
		System.out.println(optionalNames);
		
		
		List<Integer> integerList=new ArrayList<>();
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		
		Optional<Integer> optionalSum=integerList.stream().reduce((subtotal,n)->subtotal+n);
		System.out.println(optionalSum);
		
		
		List<Character> characterList=new ArrayList<>();
		characterList.add('c');
		characterList.add('e');
		characterList.add('f');
		characterList.add('b');
		
		
		 List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		 String result = letters
		.stream()
		.reduce("", (partialString, element) -> partialString + element);
         System.out.println(result);		
		 
         
         List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
         int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);
         System.out.println(computedAges);
         
         Stream.of("one", "two", "three", "four")
         .filter(e -> e.length() > 3)
         .peek(e -> System.out.println("Filtered value: " + e))
         .map(String::toUpperCase)
         .peek(e -> System.out.println("Mapped value: " + e))
         .collect(Collectors.toList());
         
		   
	}

}
