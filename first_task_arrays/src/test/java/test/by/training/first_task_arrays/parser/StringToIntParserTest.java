package test.by.training.first_task_arrays.parser;

import org.testng.annotations.Test;

import by.training.first_task_arrays.exception.CustomException;
import by.training.first_task_arrays.parser.StringToIntParser;

import static org.testng.Assert.*;

import java.awt.Desktop.Action;

public class StringToIntParserTest {
	StringToIntParser stringToIntParser = new StringToIntParser();

	@Test(expectedExceptions = { CustomException.class })
	public void parseExceptionTest() throws CustomException {
		stringToIntParser.parse("");
	}

	@Test
	public void parse() throws CustomException {
		int[] expected = { 1, 2, 3 };
		final String TEST_LINE = "1 2 3";
		int[] actual = stringToIntParser.parse(TEST_LINE);

		assertEquals(expected, actual);
	}
}
