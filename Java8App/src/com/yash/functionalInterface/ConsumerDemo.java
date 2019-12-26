package com.yash.functionalInterface;
import java.util.function.Consumer;
import com.yash.entity.Employee;
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer1=(str)->System.out.println(str);
	    consumer1.accept("sabbir");
		
		Consumer<Employee> consumer2=(e)->{
			System.out.println(e.getEmpName());
		};
		Employee e1=new Employee();
		e1.setEmpId(1001);
		e1.setEmpName("sabbir");
		e1.setEmpSalary(45000);
		e1.setEmpDesignation("Trainer");
		consumer2.accept(e1);

	}

}
