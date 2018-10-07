package com.virtusa.readByLine;

import java.util.List;


import com.virtusa.employee.Employee;


//Class for handling the responsibility of only retrieving elements by line number thus satisfying single responsibility principle
public class GetByLineImpl implements GetByLine {

	//Getting data by line number
	public Employee readByLine(List<Employee> employees,int i) {	
		if(i>0) {
			try {	
				return employees.get(i-1);
			}
			catch(Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		else
			return null;
	}






}
