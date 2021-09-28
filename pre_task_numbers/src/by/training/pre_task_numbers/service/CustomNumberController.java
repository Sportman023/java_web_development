package by.training.pre_task_numbers.service;

import java.util.ArrayList;

import by.training.pre_task_numbers.entity.CustomNumber;

public class CustomNumberController {
	
	public CustomNumberController() {
	}
	

	public CustomNumber sumCustomNumber(ArrayList<CustomNumber> customNumberList) {		
		double result = 0.0d;
		for (CustomNumber customNumber : customNumberList) {
			result += customNumber.getValue();
		}
		return new CustomNumber(result);
	}
	
	public CustomNumber differenceCustomNumber(ArrayList<CustomNumber> customNumberList) {
		
		double result = 0.0d;
		boolean firstItem = true;
		for (CustomNumber customNumber : customNumberList) {
			if(firstItem) {
				result = customNumber.getValue();
				firstItem = false;
			} else {
				result -= customNumber.getValue();
			}	
		}
		return new CustomNumber(result);
	}
	
	public CustomNumber multiplyCustomNumber(ArrayList<CustomNumber> customNumberList) {
		if (customNumberList.size() == 0) {
			return new CustomNumber(0.0d);
		}
		
		double result = 1.0d;
		for (CustomNumber customNumber : customNumberList) {
			result *= customNumber.getValue();
		}
		
		return new CustomNumber(result);
	}
	
	public CustomNumber divideCustomNumber(ArrayList<CustomNumber> customNumberList) {
		CustomNumber firstCustomNumber = customNumberList.get(0);
		if(firstCustomNumber.getValue() == 0.0d) {
			return new CustomNumber(0.0d);
		}
		
		double result = 0.0d;
		boolean firstItem = true;
		for (CustomNumber customNumber : customNumberList) {
			if(firstItem) {
				result = customNumber.getValue();
				firstItem = false;
			} else {
				result /= customNumber.getValue();
			}	
		}
		return new CustomNumber(result);
	}
	
}
