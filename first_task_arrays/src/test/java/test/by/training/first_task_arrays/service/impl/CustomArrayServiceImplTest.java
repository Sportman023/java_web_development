package test.by.training.first_task_arrays.service.impl;

import org.testng.annotations.Test;

import by.training.first_task_arrays.entity.CustomArray;
import by.training.first_task_arrays.service.impl.CustomArrayServiceImpl;

import org.testng.annotations.BeforeClass;
import static org.testng.Assert.*;

public class CustomArrayServiceImplTest {
	int[] array = { 5, 1, 0, -2 };
	CustomArray customArray;
	CustomArrayServiceImpl customArrayServiceImpl;

	@BeforeClass
	public void beforeClass() {

		customArray = new CustomArray(array);
		customArrayServiceImpl = new CustomArrayServiceImpl();
	}

	@Test
	public void minTest() {
		int actual = customArrayServiceImpl.min(customArray);
		int expected = -2;
		assertEquals(actual, expected);
	}

	@Test
	public void maxTest() {
		int actual = customArrayServiceImpl.max(customArray);
		int expected = 5;
		assertEquals(actual, expected);
	}

	@Test
	public void replaceItemTest() {
		CustomArray customArrayExpected = new CustomArray(0, 1, 0, -2);
		CustomArray customArrayActual = new CustomArray(array);
		
		customArrayServiceImpl.replaceItem(customArrayActual, 5, 0);
		assertEquals(customArrayActual, customArrayExpected);
	}

	@Test
	public void averageTest() {
		double actual = customArrayServiceImpl.average(customArray);
		double expected = 1.0d;
		assertEquals(actual, expected, 0.0001);
	}

	@Test
	public void sumTest() {
		int actual = customArrayServiceImpl.sum(customArray);
		int expected = 4;
		assertEquals(actual, expected);
	}

	@Test
	public void countPositiveItemTest() {
		int actual = customArrayServiceImpl.countPositiveItem(customArray);
		int expected = 2;
		assertEquals(actual, expected);
	}

	@Test
	public void countNegativeItemTest() {
		int actual = customArrayServiceImpl.countNegativeItem(customArray);
		int expected = 1;
		assertEquals(actual, expected);
	}
	
	@Test
	public void bubbleSort() {
		CustomArray customArrayExpected = new CustomArray(-2, 0, 1, 5);
		CustomArray customArrayActual = new CustomArray(array);
		
		customArrayServiceImpl.bubleSort(customArrayActual);

		assertEquals(customArrayActual, customArrayExpected);
	}
	
	@Test
	public void insertSort() {
		CustomArray customArrayExpected = new CustomArray(-2, 0, 1, 5);
		CustomArray customArrayActual = new CustomArray(array);
		
		customArrayServiceImpl.bubleSort(customArrayActual);

		assertEquals(customArrayActual, customArrayExpected);
	}
	
	@Test
	public void mergeSort() {
		CustomArray customArrayExpected = new CustomArray(-2, 0, 1, 5);
		CustomArray customArrayActual = new CustomArray(array);
		
		customArrayServiceImpl.mergeSort(customArrayActual);

		assertEquals(customArrayActual, customArrayExpected);
	}
}

