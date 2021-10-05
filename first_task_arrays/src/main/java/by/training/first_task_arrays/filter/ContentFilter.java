package by.training.first_task_arrays.filter;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.training.first_task_arrays.exception.CustomException;

public class ContentFilter {
	static Logger logger = LogManager.getLogger();
	private final String REGEX_INT_LINE = "^-?\\d+(\\s-?\\d+)*";

	public ContentFilter() {
	}

	public String filterFistValidLine(List<String> linesList) throws CustomException {
		if (linesList.size() == 0) {
			logger.error("There are no lines");
			throw new CustomException("There are no lines");
		}

		Pattern pattern = Pattern.compile(REGEX_INT_LINE);
		String validLine = "";

		for (String line : linesList) {
			Matcher matcher = pattern.matcher(line);

			if (matcher.find()) {
				validLine = matcher.group();
				break;
			}
		}
		return validLine;
	}
}
