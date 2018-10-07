package Main;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.employee.Employee;
import com.virtusa.employeeList.CSVToList;
import com.virtusa.employeeList.CSVToListImpl;
import com.virtusa.employeeServices.EmployeeServices;
import com.virtusa.employeeServices.EmployeeServicesImpl;
import com.virtusa.readByLine.GetByLine;
import com.virtusa.readByLine.GetByLineImpl;



public class Main {

	public static void main(String args[]) {
		List<Employee> employees=new ArrayList<Employee>();
		CSVToList c=new CSVToListImpl();
		GetByLine g=new GetByLineImpl();
		EmployeeServices e = new EmployeeServicesImpl();
		employees=c.csvToList();

		int lineNum=14;
		int id=1;
		String name="Surabhi";
		int age=23;
		int salary=19000;

		//Code To Print All Employees
		System.out.println("\n\nList of all employees");
		for(int i=0;i<employees.size();i++)
			System.out.println(employees.get(i));


		//Reading a CSV File By line
		System.out.println("\n\nEmployee at Line number:"+lineNum);
		System.out.println(g.readByLine(employees,lineNum));


		//Searching an Employee By id
		System.out.println("\n\nEmployee with id:"+id);
		System.out.println(e.getById(employees, id));



		//Searching an Employee By name
		System.out.println("\n\nEmployees with name:"+name);
		List<Employee> names=e.getByName(employees, name);
		for(Employee emp : names)
			System.out.println(emp);



		//Searching an Employee By age
		System.out.println("\n\nEmployees with age:"+age);
		List<Employee> ages=e.getByAge(employees, age);
		for(Employee emp : ages)
			System.out.println(emp);


		//Searching an Employee By Salary
		System.out.println("\n\nEmployees with Salary:"+salary);
		List<Employee> salaries=e.getBySalary(employees, salary);
		for(Employee emp : salaries)
			System.out.println(emp);


	}

}
