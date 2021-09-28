package by.training.pre_task_numbers.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileController {
	static Logger logger = LogManager.getLogger();
	
	public FileController () {
	}

	public String readFile (String path) {
		String fileContent = "";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(path)));){
			
			String currentLine = reader.readLine();	
			
			while (currentLine != null) {
				fileContent += currentLine + "\n";
				currentLine = reader.readLine();
			}
		} catch (IOException e) {
			logger.error("IOException", e);
		}
		return fileContent;
	}
}
