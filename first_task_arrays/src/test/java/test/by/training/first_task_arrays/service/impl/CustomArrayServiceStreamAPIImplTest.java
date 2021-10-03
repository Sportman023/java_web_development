package test.by.training.first_task_arrays.service.impl;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.training.first_task_arrays.entity.CustomArray;
import by.training.first_task_arrays.service.impl.CustomArrayServiceStreamAPIImpl;

public class CustomArrayServiceStreamAPIImplTest {
	int[] array = { 5, 7, 0, -2 };
	CustomArray customArray;
	CustomArrayServiceStreamAPIImpl customArrayServiceStreamAPIImpl;
	
	@BeforeClass
	public void beforeClass() {

		customArray = new CustomArray(array);
		customArrayServiceStreamAPIImpl = new CustomArrayServiceStreamAPIImpl();
	}
	
  @Test
  public void minTest() {
		int actual = customArrayServiceStreamAPIImpl.min(customArray);
		int expected = -2;
		assertEquals(actual, expected);
  }
  
  @Test
  public void maxTest() {
		int actual = customArrayServiceStreamAPIImpl.max(customArray);
		int expected = 7;
		assertEquals(actual, expected);
  }
  
	@Test
	public void replaceItemTest() {
		CustomArray customArrayExpected = new CustomArray(0, 7, 0, -2);
		CustomArray customArrayActual = new CustomArray(array);
		
		customArrayServiceStreamAPIImpl.replaceItem(customArrayActual, 5, 0);
		assertEquals(customArrayActual, customArrayExpected);
	}

  
  @Test
  public void averageTest() {
		double actual = customArrayServiceStreamAPIImpl.average(customArray);
		double expected = 2.5d;
		assertEquals(actual, expected, 0.001);
  }
  
  @Test
  public void sumTest() {
		int actual = customArrayServiceStreamAPIImpl.sum(customArray);
		int expected = 10;
		assertEquals(actual, expected);
  }
  
  @Test
  public void countPositiveItemTest() {
		int actual = customArrayServiceStreamAPIImpl.countPositiveItem(customArray);
		int expected = 2;
		assertEquals(actual, expected);
  }
  
  @Test
  public void countNegativeItemTest() {
		int actual = customArrayServiceStreamAPIImpl.countNegativeItem(customArray);
		int expected = 1;
		assertEquals(actual, expected);
  }
	@Test
	public void sortCustomArrayTest() {
		CustomArray customArrayExpected = new CustomArray(-2, 0, 5, 7);
		CustomArray customArrayActual = new CustomArray(array);
		
		customArrayServiceStreamAPIImpl.sortCustomArray(customArrayActual);
		assertEquals(customArrayActual, customArrayExpected);
	}
}
