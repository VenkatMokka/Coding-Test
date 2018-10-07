package csvFileReaderTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.virtusa.employee.Employee;
import com.virtusa.employeeList.CSVToList;
import com.virtusa.employeeList.CSVToListImpl;
import com.virtusa.employeeServices.EmployeeServices;
import com.virtusa.employeeServices.EmployeeServicesImpl;

import junit.framework.Assert;

public class EmployeeServicesTest {

	EmployeeServices e=new EmployeeServicesImpl();
	List<Employee> res= new ArrayList();
	int id=1;
	String name="Venkat";
	int age=23;
	int salary=19000;

	Employee e1= new Employee(1,"Venkat",23,19000);
	Employee e2= new Employee(2,"Surabhi",24,20000);
	Employee e3= new Employee(3,"Durga",25,21000);
	Employee e4= new Employee(4,"Kiran",26,22000);

	@Before
	public void initialize() {
		res.add(e1);
		res.add(e2);
		res.add(e3);
		res.add(e4);
	}

	@Test
	public void getByIdTest() {		
		List<Employee> emp=e.getById(res, id);
		Assert.assertEquals(1, emp.get(0).getId());
	}

	@Test
	public void getByNameTest() {		
		List<Employee> emp=e.getByName(res, name);
		Assert.assertEquals(1, emp.get(0).getId());

	}

	@Test
	public void getByAgeTest() {		
		List<Employee> emp=e.getByAge(res, age);
		Assert.assertEquals(1, emp.get(0).getId());

	}
	@Test
	public void getBySalaryTest() {		
		List<Employee> emp=e.getBySalary(res, salary);
		Assert.assertEquals(1, emp.get(0).getId());

	}
}
