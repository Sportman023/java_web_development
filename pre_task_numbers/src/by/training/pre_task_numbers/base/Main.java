package by.training.pre_task_numbers.base;

import java.io.File;


/*
 * Задание: Создать класс Число.
 * Прочитать числа из текстового файла.
 * Выполнить валидацию и преобразование.
 * Создать фабрику по созданию объектов класса Число.
 * Разработать service-классы реализующие функциональности:
 * +, -, *, /.
 */

public class Main {

	public static void main(String[] args) {
		final String PATH = "Numbers .txt";
		
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
