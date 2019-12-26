package com.yash.methodreference;
import com.yash.entity.Employee;
public class MethodReference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEmpName("sabbir");
		e.setEmpSalary(45000);
		Converter<String,String> converter=e::empNameToUpperCase;
		String empName=converter.convert(e.getEmpName());
		System.out.println("Emp Name:"+empName);
		
		Computer<Double,Double> computer=Employee::computeTax;
		Double tax=computer.compute(e.getEmpSalary());
		System.out.println("Tax is:"+tax);
		
		EmployeeFactory<Employee> factory=Employee::new;
		Employee employeeCreated=factory.create(101,"amit",34000,"trainer");
		System.out.println(employeeCreated);
		
		
	}
}
