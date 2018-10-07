package com.virtusa.employeeList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.employee.Employee;


//Class for handling the responsibility of only only converting CSV file to list thus satisfying single responsibility principle
public class CSVToListImpl implements CSVToList  {

	private static final String COMMA_DELIMITER = ",";

	//Method for converting CSV file to list
	public List<Employee> csvToList(){
		BufferedReader br = null;

		//Create List for holding Employee objects
		List<Employee> empList = new ArrayList<Employee>();

		try {
			//Reading the csv file
			br =  new BufferedReader(new FileReader("Employee.csv"));
			String line = null;			
			while ((line = br.readLine()) != null){
				String[] employeeDetails = line.split(COMMA_DELIMITER);
				if(employeeDetails.length > 0 ){
					//Save the employee details in Employee object
					Employee emp=new Employee();
					emp.setId(Integer.parseInt(employeeDetails[0]));
					emp.setName(employeeDetails[1]);
					emp.setAge(Integer.parseInt(employeeDetails[2]));
					emp.setSalary(Integer.parseInt(employeeDetails[3]));
					empList.add(emp);
				}
			}

		}
		catch(Exception ee){     
			ee.printStackTrace();
			throw new RuntimeException(ee);
		}
		return empList;

	}
}
