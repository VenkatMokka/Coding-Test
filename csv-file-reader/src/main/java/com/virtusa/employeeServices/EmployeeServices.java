package com.virtusa.employeeServices;

import java.util.List;

import com.virtusa.employee.Employee;

public interface EmployeeServices {

	public List<Employee> getByName(List<Employee> employees,String name);
	public List<Employee> getById(List<Employee> employees, int id);
	public List<Employee> getBySalary(List<Employee> employees, int sal);
	public List<Employee> getByAge(List<Employee> employees, int age);
}

