package by.training.pre_task_numbers.base;

import java.util.ArrayList;

public class CustomNumberView {
	private CustomNumberController customNumberController;
	
	public CustomNumberView(CustomNumberController customNumberController) {
		this.customNumberController = customNumberController;
	}
	
	private boolean listIsEmpty() {
		ArrayList<CustomNumber> customNumberList = customNumberController.getCustomNumberList();	
		int listSize = customNumberList.size();
		if(listSize == 0) {
			System.out.println("There are no values to operate.");
			return true;
		}
		return false;
	}
	
	private void printValuesWithOperator(String operator) {
		ArrayList<CustomNumber> customNumberList = customNumberController.getCustomNumberList();
		String valuesString;
		CustomNumber customNumber = customNumberList.get(0);
		double value = customNumber.getValue();
		valuesString = String.valueOf(value);
		
		for (int i = 1; i < customNumberList.size(); i++) {
			customNumber = customNumberList.get(i);
			value = customNumber.getValue();
			valuesString += " " + operator + " " + String.valueOf(value);
		}
		
		valuesString += " = ";
		System.out.print(valuesString);
		
	}
	
	private boolean isDivideByZero() {
		ArrayList<CustomNumber> customNumberList = customNumberController.getCustomNumberList();
		CustomNumber customNumber;
		double value;
		//начинаю перебор с i = 1, т.к. i = 0 может равнятся нули, а ноль можно делить на ненулевые числа
		for (int i = 1; i < customNumberList.size(); i++) {
			customNumber = customNumberList.get(i);
			value = customNumber.getValue();
			if(value == 0.0) {
				System.out.println("Arithmetic mistake: you try to divide by zero!");
				return true;
			}
		}
		return false;
	}
	
	public void sumCustomNumber() {	
		if(!listIsEmpty()) {
			printValuesWithOperator("+");
			System.out.println(customNumberController.sumCustomNumber());
		}
	}
	
	public void differenceCustomNumber() {
		if(!listIsEmpty()) {
			printValuesWithOperator("-");
			double result = customNumberController.differenceCustomNumber();
			System.out.println(Math.round(result * 100.0) / 100.0);
		}
	}
	
	public void multiplyCustomNumber() {
		if(!listIsEmpty()) {
			printValuesWithOperator("X");
			System.out.println(customNumberController.multiplyCustomNumber());
		}
	}
	
	public void divideCustomNumber() {
		if( ! (listIsEmpty() || isDivideByZero())) {
			printValuesWithOperator("/");
			double result = customNumberController.divideCustomNumber();	
			System.out.println(Math.round(result * 100.0) / 100.0);
		}
	}
}
