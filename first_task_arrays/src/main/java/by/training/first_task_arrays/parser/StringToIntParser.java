package by.training.first_task_arrays.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class StringToIntParser {
	private final String REGEX_INT = "\\d+";

	public StringToIntParser() {
	}

	public int[] parse(String line) {

		
		Pattern pattern = Pattern.compile(REGEX_INT);
		Matcher matcher = pattern.matcher(line);

		List<Integer> integerList = new ArrayList<Integer>();
		Integer value;
		
		while (matcher.find()) {
			value = Integer.valueOf(matcher.group());
			integerList.add(value);
		}

		int[] intArray = new int[integerList.size()];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = integerList.get(i);
		}
		
		return intArray;
	}
}
