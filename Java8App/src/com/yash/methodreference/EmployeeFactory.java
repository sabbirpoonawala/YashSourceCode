package com.yash.methodreference;
import com.yash.entity.Employee;
@FunctionalInterface
public interface EmployeeFactory<E extends Employee> {
	public abstract Employee create(int empId,String empName,double empSalary,String empDesignation);
}
