package test.by.training.first_task_arrays.service.impl;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.training.first_task_arrays.entity.CustomArray;
import by.training.first_task_arrays.service.impl.CustomArrayServiceStreamAPIImpl;

public class CustomArrayServiceStreamAPIImplTest {
	int[] array = { 5, -9, 0, -2 };
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
		int expected = -9;
		assertEquals(actual, expected);
  }
}
