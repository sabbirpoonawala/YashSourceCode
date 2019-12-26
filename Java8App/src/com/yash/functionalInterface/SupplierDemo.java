package com.yash.functionalInterface;
import java.util.function.Supplier;
import com.yash.entity.Employee;
public class SupplierDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Employee> supplier1=Employee::new;
		System.out.println(supplier1.get());
		
		Supplier<String> supplier2=()->"Hello";
		System.out.println(supplier2.get());
		
		Supplier<String> supplier3=()->{
			String s1="Hello";
			String s2="World";
			return s1.concat(s2);
		};
		System.out.println(supplier3.get());
		
			Supplier<Employee> supplier4=()->{
			Employee e1=new Employee();
			e1.setEmpId(1001);
			e1.setEmpName("sabbir");
			e1.setEmpSalary(34000);
			e1.setEmpDesignation("Trainer");
			return e1;
		};
		System.out.println(supplier4.get());
	}
}
