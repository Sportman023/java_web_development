package by.training.first_task_arrays.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.training.first_task_arrays.exception.CustomException;

public class CustomFileReader {
	static Logger logger = LogManager.getLogger();

	public CustomFileReader() {
	}

	public List<String> readFile(String fileName) throws CustomException {

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			List<String> linesList = new ArrayList<String>();
			linesList = stream.collect(Collectors.toList());
			return linesList;

		} catch (IOException e) {
			logger.error("File doesn't exist", e);
			throw new CustomException("File doesn't exist");
		}
	}
}