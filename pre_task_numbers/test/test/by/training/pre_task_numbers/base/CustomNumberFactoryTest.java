package test.by.training.pre_task_numbers.base;

import java.util.ArrayList;

import by.training.pre_task_numbers.base.CustomNumber;
import by.training.pre_task_numbers.base.CustomNumberFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CustomNumberFactoryTest {
	private ArrayList<CustomNumber> customNumberList;
	private final String FILE_CONTENT = "JAVA 10.12!!!";
	private CustomNumber CustomNumber1;
	private CustomNumber CustomNumber2;
	private final double  VALUE = 10.12;
	
	@Test
	public void testFillCustomNumberList() {
		CustomNumber1 = new CustomNumber(VALUE);
		
		CustomNumberFactory customFactory = new CustomNumberFactory(FILE_CONTENT);
		customNumberList = customFactory.getCustomNumberList();
		CustomNumber2 = customNumberList.get(0);
		
		assertTrue(CustomNumber1.equals(CustomNumber2));
	}
}
