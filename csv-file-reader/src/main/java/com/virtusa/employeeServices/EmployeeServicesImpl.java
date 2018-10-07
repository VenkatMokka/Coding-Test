package com.virtusa.employeeServices;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.employee.Employee;

//Class for handling the responsibility of only retrieving elements thus satisfying single responsibility principle
public class EmployeeServicesImpl implements EmployeeServices{	

	//Method to get employees by names
	public List<Employee> getByName(List<Employee> employees, String name) {
		List<Employee> res= new ArrayList<Employee>();
		try {
			for(Employee emp : employees) {
				if(emp.getName().equalsIgnoreCase(name))
					res.add(emp);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}		
		return res;
	}

	//Method to get an employee by id
	public List<Employee> getById(List<Employee> employees, int id) {
		List<Employee> res= new ArrayList<Employee>();
		try {
			for(Employee emp : employees) {
				if(emp.getId()==id)
					res.add(emp);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return res;
	}

	//Method to get empployees by salaries
	public List<Employee> getBySalary(List<Employee> employees, int sal) {

		List<Employee> res= new ArrayList<Employee>();
		try {
			for(Employee emp : employees) {
				if(emp.getSalary()==sal)
					res.add(emp);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return res;

	}

	//Method to list employees by ages
	public List<Employee> getByAge(List<Employee> employees, int age) {
		List<Employee> res= new ArrayList<Employee>();
		try {
			for(Employee emp : employees) {
				if(emp.getAge()==age)
					res.add(emp);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return res;
	}


}
