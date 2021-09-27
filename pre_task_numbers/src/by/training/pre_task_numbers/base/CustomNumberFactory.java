package by.training.pre_task_numbers.base;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CustomNumberFactory {
	private ArrayList<CustomNumber> customNumberList = new ArrayList<CustomNumber>();
	private String fileContent;
	
	public CustomNumberFactory(String fileContent) {
		this.fileContent = fileContent;
		fillCustomNumberList();
	}
	
	public void fillCustomNumberList() {
		
		String regex = "\\d+\\.\\d+";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fileContent);

		String doubleString;
		while (matcher.find()) {
			doubleString = matcher.group();
			double value = Double.valueOf(doubleString);

			customNumberList.add(new CustomNumber(value));
		}
	}

	public ArrayList<CustomNumber> getCustomNumberList() {
		return customNumberList;
	}

	public void setCustomNumberList(ArrayList<CustomNumber> customNumberList) {
		this.customNumberList = customNumberList;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
}
