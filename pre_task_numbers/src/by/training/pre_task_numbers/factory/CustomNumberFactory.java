package by.training.pre_task_numbers.factory;

import java.util.ArrayList;


import by.training.pre_task_numbers.entity.CustomNumber;


public class CustomNumberFactory {
	
	public CustomNumberFactory() {
	}
	
	public ArrayList<CustomNumber> createCustomNumberList(ArrayList<Double> doubleList) {
		ArrayList<CustomNumber>customNumberList = new ArrayList<CustomNumber>();
		
		for (Double doubleNumber : doubleList) {
			customNumberList.add(new CustomNumber(doubleNumber));
		}
		return customNumberList;
	}
}