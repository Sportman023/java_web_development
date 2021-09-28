package by.training.pre_task_numbers.validator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {
	public NumberValidator() {
	}
	
	public ArrayList<Double> findDouble(String text) {
		final String REGEX = "[+-]?\\d+\\.\\d+";

		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(text);
		ArrayList<Double> doubleArray = new ArrayList<Double>();
		
		String doubleString;
		while (matcher.find()) {
			doubleString = matcher.group();
			doubleArray.add(parceStringToDouble(doubleString));
		}
		return doubleArray;
	}
	
	private Double parceStringToDouble(String doubleStr) {
		return Double.parseDouble(doubleStr);
	}
}
