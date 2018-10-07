package csvFileReaderTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.virtusa.employee.Employee;
import com.virtusa.employeeList.CSVToList;
import com.virtusa.employeeList.CSVToListImpl;
import com.virtusa.readByLine.GetByLine;
import com.virtusa.readByLine.GetByLineImpl;

import junit.framework.Assert;

public class GetByLineImplTest {



	List<Employee> res= new ArrayList();

	Employee e1= new Employee(1,"Venkat",23,19000);
	Employee e2= new Employee(2,"Surabhi",23,19000);
	Employee e3= new Employee(3,"Durga",23,19000);
	Employee e4= new Employee(4,"Kiran",23,19000);
	GetByLine g=new GetByLineImpl();
	int lineNum=1;

	@Test
	public void readByLinetest() {
		res.add(e1);
		res.add(e2);
		res.add(e3);
		res.add(e4);

		Employee e=g.readByLine(res,lineNum);
		Assert.assertEquals(1, e.getId());
	}


}
