package by.training.first_task_arrays.service.impl;

import by.training.first_task_arrays.entity.CustomArray;
import by.training.first_task_arrays.service.CustomArrayService;
import by.training.first_task_arrays.service.CustomArraySortService;

public class CustomArrayServiceImpl implements CustomArrayService, CustomArraySortService {

	@Override
	public int min(CustomArray customArray) {

		int[] array = customArray.getArray();
		int min = array[0];

		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	@Override
	public int max(CustomArray customArray) {

		int[] array = customArray.getArray();
		int max = array[0];

		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	@Override
	public void replaceItem(CustomArray customArray, int oldValue, int newValue) {

		int[] array = customArray.getArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == oldValue) {
				array[i] = newValue;
			}
		}
		customArray.setArray(array);
	}

	@Override
	public double average(CustomArray customArray) {
		double sum = (double) sum(customArray);
		int[] array = customArray.getArray();
		double quantityItems = (double) array.length;
		return sum / quantityItems;
	}

	@Override
	public int sum(CustomArray customArray) {

		int[] array = customArray.getArray();
		int sum = 0;

		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	@Override
	public int countPositiveItem(CustomArray customArray) {

		int[] array = customArray.getArray();
		int quantityPositiveItems = 0;

		for (int i : array) {
			if (i > 0)
				quantityPositiveItems++;
		}
		return quantityPositiveItems;
	}

	@Override
	public int countNegativeItem(CustomArray customArray) {

		int[] array = customArray.getArray();
		int quantityPositiveItems = 0;

		for (int i : array) {
			if (i < 0)
				quantityPositiveItems++;
		}
		return quantityPositiveItems;
	}

	@Override
	public void bubleSort(CustomArray customArray) {
		int swapNumbers;
		int[] array = customArray.getArray();
		
		do {
			swapNumbers = 0;
			for (int i = 0; i < array.length - 1; i++) {
				int temp;
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapNumbers++;
				}
			}
		} while (swapNumbers > 0);
		customArray.setArray(array);
	}

	@Override
	public void insertSort(CustomArray customArray) {
		int[] array = customArray.getArray();
		int length = array.length;
		for (int i = 1; i < length; i++) {
			int j = i - 1;
			int value = array[i];
			
			while (j > -1 || array[j] > value) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = value;
		}
		customArray.setArray(array);
	}

	@Override
	public void mergeSort(CustomArray customArray) {
	    int array[] = customArray.getArray();
	    mergeSortArray(array);
	    customArray.setArray(array);
		
	}
	
	private void mergeSortArray(int[] array) {
		int lenght = array.length;
		
		if (lenght < 2) {
	        return;
	    }
		
	    int mid = lenght / 2;
	    int[] leftArray = new int[mid];
	    int[] rightArray = new int[lenght - mid];

	    for (int i = 0; i < mid; i++) {
	    	leftArray[i] = array[i];
	    }
	    for (int i = mid; i < lenght; i++) {
	    	rightArray[i - mid] = array[i];
	    }
	    
	    mergeSortArray(leftArray);
	    mergeSortArray(rightArray);

	    mergeArrays(array, leftArray, rightArray, mid, lenght - mid);
		
	}
	
	private void mergeArrays(int[] array, int[] leftArray, int[] rightArray, int leftLenght, int rightLenght) {

		int iL = 0; 
		int iR = 0;
		int iA = 0;
		
		while (iL < leftLenght && iR < rightLenght) {
			if (leftArray[iL] <= rightArray[iR]) {
				array[iA++] = leftArray[iL++];
			} else {
				array[iA++] = rightArray[iR++];
			}
		}
		while (iL < leftLenght) {
			array[iA++] = leftArray[iL++];
		}
		while (iR < rightLenght) {
			array[iA++] = rightArray[iR++];
		}
	}
}
