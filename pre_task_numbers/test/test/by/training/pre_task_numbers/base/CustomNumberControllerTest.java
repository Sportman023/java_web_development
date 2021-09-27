package test.by.training.pre_task_numbers.base;

import java.util.ArrayList;

import by.training.pre_task_numbers.base.CustomNumber;
import by.training.pre_task_numbers.base.CustomNumberController;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

class CustomNumberControllerTest {
	private ArrayList<CustomNumber> customNumberList;
	private CustomNumberController customNumberController;
	private double TEST_VALUE_1 = 10.0;
	private double TEST_VALUE_2 = 2.0;
	
	@BeforeClass
	public void SetUp(){
		customNumberList = new ArrayList <CustomNumber>();
		customNumberList.add(new CustomNumber(TEST_VALUE_1));
		customNumberList.add(new CustomNumber(TEST_VALUE_2));
		customNumberController = new CustomNumberController(customNumberList);
	}
	
	
	@Test
	public void testSumCustomNumber() {
		double actual = customNumberController.sumCustomNumber();
		double expected = 12.0;
		
		assertEquals(actual, expected, 0.001, "Test faild");	
	}
	
	@Test
	public void testDifferenceCustomNumber() {
		double actual = customNumberController.differenceCustomNumber();
		double expected = 8.0;
		
		assertEquals(actual, expected, 0.001, "Test faild");	
	}
	
	@Test
	public void testMultiplyCustomNumber() {
		double actual = customNumberController.multiplyCustomNumber();
		double expected = 20.0;
		
		assertEquals(actual, expected, 0.001, "Test faild");
	}
	
	@Test
	public void testDivideCustomNumber() {
		double actual = customNumberController.divideCustomNumber();
		double expected = 5.0;
		
		assertEquals(actual, expected, 0.001, "Test faild");
	}
}
 