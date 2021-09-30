package by.training.first_task_arrays.service.impl;

import by.training.first_task_arrays.entity.CustomArray;
import by.training.first_task_arrays.service.CustomArrayService;
import by.training.first_task_arrays.validator.CustomArrayValidator;

public class CustomArrayServiceImpl implements CustomArrayService {

	@Override
	public int min(CustomArray customArray) {
		CustomArrayValidator customArrayValidator = new CustomArrayValidator();

		if (customArrayValidator.isArrayValid(customArray)) {
			int[] array = customArray.getArray();
			int min = array[0];

			for (int i : array) {
				if (i < min) {
					min = i;
				}
			}
			return min;
		}
		// rewrite
		return 0;
	}

	@Override
	public int max(CustomArray customArray) {
		CustomArrayValidator customArrayValidator = new CustomArrayValidator();

		if (customArrayValidator.isArrayValid(customArray)) {
			int[] array = customArray.getArray();
			int max = array[0];

			for (int i : array) {
				if (i > max) {
					max = i;
				}
			}
			return max;
		}
		// rewrite
		return 0;
	}

	@Override
	public CustomArray replaceItem(CustomArray customArray, int oldValue, int newValue) {
		CustomArrayValidator customArrayValidator = new CustomArrayValidator();

		if (customArrayValidator.isArrayValid(customArray)) {
			int[] array = customArray.getArray();

			for (int i = 0; i < array.length; i++) {
				if (array[i] == oldValue) {
					array[i] = newValue;
				}
			}

			return new CustomArray(array);
		}
		// rewrite
		return customArray;
	}

	@Override
	public double average(CustomArray customArray) {
		double sum = (double)sum(customArray);
		int[] array = customArray.getArray();
		double quantityItems = (double)array.length;
		return sum / quantityItems;
	}

	@Override
	public int sum(CustomArray customArray) {
		CustomArrayValidator customArrayValidator = new CustomArrayValidator();

		if (customArrayValidator.isArrayValid(customArray)) {
			int[] array = customArray.getArray();
			int sum = 0;

			for (int i : array) {
				sum+= i;
			}
			return sum;
		}
		// rewrite
		return 0;
	}


	@Override
	public int countPositiveItem(CustomArray customArray) {
		CustomArrayValidator customArrayValidator = new CustomArrayValidator();

		if (customArrayValidator.isArrayValid(customArray)) {
			int[] array = customArray.getArray();
			int quantityPositiveItems = 0;

			for (int i : array) {
				if(i > 0)
				quantityPositiveItems++;
			}
			return quantityPositiveItems;
		}
		// rewrite
		return 0;
	}

	@Override
	public int countNegativeItem(CustomArray customArray) {
		CustomArrayValidator customArrayValidator = new CustomArrayValidator();

		if (customArrayValidator.isArrayValid(customArray)) {
			int[] array = customArray.getArray();
			int quantityPositiveItems = 0;

			for (int i : array) {
				if(i < 0)
				quantityPositiveItems++;
			}
			return quantityPositiveItems;
		}
		// rewrite
		return 0;
	}

}
