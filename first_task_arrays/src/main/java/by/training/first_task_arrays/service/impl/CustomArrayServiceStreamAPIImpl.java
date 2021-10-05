package by.training.first_task_arrays.service.impl;

import java.util.Arrays;

import by.training.first_task_arrays.entity.CustomArray;
import by.training.first_task_arrays.service.CustomArrayService;
import by.training.first_task_arrays.service.CustomArraySortStreamAPIService;

public class CustomArrayServiceStreamAPIImpl implements CustomArrayService, CustomArraySortStreamAPIService {

	public CustomArrayServiceStreamAPIImpl() {
	}

	@Override
	public int min(CustomArray customArray) {
		int[] array = customArray.getArray();
		return Arrays.stream(array).min().getAsInt();
	}

	@Override
	public int max(CustomArray customArray) {
		int[] array = customArray.getArray();
		return Arrays.stream(array).max().getAsInt();
	}

	@Override
	public void replaceItem(CustomArray customArray, int oldValue, int newValue) {
		int[] array = customArray.getArray();
		array = Arrays.stream(array).map(o -> o == oldValue ? newValue : o).toArray();
		customArray.setArray(array);
	}

	@Override
	public double average(CustomArray customArray) {
		int[] array = customArray.getArray();
		return Arrays.stream(array).average().getAsDouble();
	}

	@Override
	public int sum(CustomArray customArray) {
		int[] array = customArray.getArray();
		return Arrays.stream(array).sum();
	}

	@Override
	public int countPositiveItem(CustomArray customArray) {
		int[] array = customArray.getArray();
		long countLong = Arrays.stream(array).filter(n -> n > 0).count();
		return (int) countLong;
	}

	@Override
	public int countNegativeItem(CustomArray customArray) {
		int[] array = customArray.getArray();
		long countLong = Arrays.stream(array).filter(n -> n < 0).count();
		return (int) countLong;
	}

	public void sortCustomArray(CustomArray customArray) {
		int[] array = customArray.getArray();
		array = Arrays.stream(array).sorted().toArray();
		customArray.setArray(array);
	}
}
