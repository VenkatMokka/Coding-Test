package csvFileReaderTest;
import static org.junit.Assert.*;

import org.junit.Test;

import com.virtusa.employeeList.CSVToList;
import com.virtusa.employeeList.CSVToListImpl;

import junit.framework.Assert;

public class CSVToListImplTest {
	CSVToList c =new CSVToListImpl(); 
	int size=15;
	@Test
	public void csvToListTest() {
		Assert.assertEquals(size, c.csvToList().size());	
	}

}
