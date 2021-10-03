package by.training.first_task_arrays.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.training.first_task_arrays.exception.CustomException;

public class StringToIntParser {

	public StringToIntParser() {
	}

	public int[] parse(String line) {

		final String REGEX = "\\d+";
		Pattern pattern = Pattern.compile(REGEX);
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
