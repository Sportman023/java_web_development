package by.training.pre_task_numbers.main;

import java.util.ArrayList;

import by.training.pre_task_numbers.entity.CustomNumber;
import by.training.pre_task_numbers.factory.CustomNumberFactory;
import by.training.pre_task_numbers.reader.FileController;
import by.training.pre_task_numbers.service.CustomNumberController;
import by.training.pre_task_numbers.validator.NumberValidator;


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
		final String PATH = "data/Numbers.txt";
		
		FileController fileController = new FileController();	
		String fileContent = fileController.readFile(PATH);
		NumberValidator numberValidator = new NumberValidator();
		ArrayList<Double> doubleList = numberValidator.findDouble(fileContent);
	
		CustomNumberFactory customNumberFactory = new CustomNumberFactory();
		ArrayList<CustomNumber> customNumberList = customNumberFactory.createCustomNumberList(doubleList);
		
		CustomNumberController customNumberController = new CustomNumberController();
		
		CustomNumber sumCustomNumber = customNumberController.sumCustomNumber(customNumberList);
		System.out.println(sumCustomNumber.toString());
		
		CustomNumber differenceCustomNumber = customNumberController.differenceCustomNumber(customNumberList);
		System.out.println(differenceCustomNumber.toString());
		
		CustomNumber divideCustomNumber = customNumberController.divideCustomNumber(customNumberList);
		System.out.println(divideCustomNumber.toString());
	}

}
