package by.training.first_task_arrays.service.impl;

import by.training.first_task_arrays.entity.CustomArray;
import by.training.first_task_arrays.service.CustomArrayService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomArrayServiceStreamAPIImpl implements CustomArrayService {

	public CustomArrayServiceStreamAPIImpl() {
	}

	@Override
	public int min(CustomArray customArray) {
		int [] array = customArray.getArray();

		return Arrays.stream(array).min().orElse(0);
	}

	@Override
	public int max(CustomArray customArray) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void replaceItem(CustomArray customArray, int oldValue, int newValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public double average(CustomArray customArray) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(CustomArray customArray) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countPositiveItem(CustomArray customArray) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countNegativeItem(CustomArray customArray) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void bubleSort(CustomArray customArray) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertSort(CustomArray customArray) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mergeSort(CustomArray customArray) {
		// TODO Auto-generated method stub

	}

}
