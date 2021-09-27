package by.training.pre_task_numbers.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileController {
	private File file;
	private String fileContent;
	
	public FileController (File file) {
		this.file = file;
		readFile();
	}

	public void readFile () {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			fileContent = "";
			String currentLine = reader.readLine();	
			
			while (currentLine != null) {
				fileContent += currentLine + "\n";
				currentLine = reader.readLine();
			}
			
			
		} catch (IOException e) {
			//преписать!!!
			System.out.println("error");
		}
		
	}
	
	
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		fileContent = fileContent;
	}
}
