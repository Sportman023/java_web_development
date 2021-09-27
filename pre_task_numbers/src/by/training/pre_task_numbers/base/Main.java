package by.training.pre_task_numbers.base;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		final String PATH = "Numbers.txt";
		
		File file = new File(PATH);
		FileController fileController = new FileController(file);
		CustomNumberFactory customNumberFactory = new CustomNumberFactory(fileController.getFileContent());
		
		CustomNumberController customNumberController = new CustomNumberController(customNumberFactory.getCustomNumberList());
		CustomNumberView customNumberView = new CustomNumberView(customNumberController);
		customNumberView.sumCustomNumber();
		customNumberView.differenceCustomNumber();
		customNumberView.multiplyCustomNumber();
		customNumberView.divideCustomNumber();
		
	}

}
