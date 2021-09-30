package by.training.first_task_arrays.validator;

import java.security.InvalidParameterException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.training.first_task_arrays.entity.CustomArray;

public class CustomArrayValidator {
	static Logger logger = LogManager.getLogger();
	
	public boolean isArrayValid(CustomArray customArray) {
		if (customArray == null) {
			throw (new InvalidParameterException("customArray is null"));
		}
		
		int [] array = customArray.getArray();
		if (array == null) {
			throw (new InvalidParameterException("Array is null"));
		}
		
		if (array.length == 0) {
			throw (new InvalidParameterException("Array is empty"));
		}
		return true;
	}
}
