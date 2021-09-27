package by.training.pre_task_numbers.base;

import java.util.ArrayList;

public class CustomNumberController {
	private ArrayList<CustomNumber> customNumberList;
	
	public CustomNumberController(ArrayList<CustomNumber> customNumberList) {
		this.customNumberList = customNumberList;
	}
	
	
	public ArrayList<CustomNumber> getCustomNumberList() {
		return customNumberList;
	}

	public void setCustomNumberList(ArrayList<CustomNumber> customNumberList) {
		this.customNumberList = customNumberList;
	}





	public double sumCustomNumber() {
		
		double result = 0.0d;
		for (CustomNumber customNumber : customNumberList) {
			result += customNumber.getValue();
		}
		return result;
	}
	
	public double differenceCustomNumber() {
		
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
		return result;
	}
	
	public double multiplyCustomNumber() {
		if (customNumberList.size() == 0) {
			return 0.0d;
		}
		
		double result = 1.0d;
		for (CustomNumber customNumber : customNumberList) {
			result *= customNumber.getValue();
		}
		
		return result;
	}
	
	public double divideCustomNumber() {
		CustomNumber firstCustomNumber = customNumberList.get(0);
		if(firstCustomNumber.getValue() == 0.0d) {
			return 0.0;
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
		return result;
	}
	
}
