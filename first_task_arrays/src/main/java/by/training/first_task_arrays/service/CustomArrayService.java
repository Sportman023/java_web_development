package by.training.first_task_arrays.service;

import by.training.first_task_arrays.entity.CustomArray;

public interface CustomArrayService {
	public abstract int min(CustomArray customArray);
	public abstract int max(CustomArray customArray);
	public abstract CustomArray replaceItem(CustomArray customArray, int oldValue, int newValue);
	public abstract double average(CustomArray customArray);
	public abstract int sum(CustomArray customArray);
	public abstract int countPositiveItem(CustomArray customArray);
	public abstract int countNegativeItem(CustomArray customArray);
}