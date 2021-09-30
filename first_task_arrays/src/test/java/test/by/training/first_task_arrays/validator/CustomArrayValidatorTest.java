package test.by.training.first_task_arrays.validator;

import java.security.InvalidParameterException;

import org.testng.annotations.Test;

import by.training.first_task_arrays.entity.CustomArray;
import by.training.first_task_arrays.validator.CustomArrayValidator;

public class CustomArrayValidatorTest {
	CustomArrayValidator customArrayValidator = new CustomArrayValidator();
	
	
  @Test(expectedExceptions = {InvalidParameterException.class})
  public void isArrayValidTestWhenParameterIsNull() {
    customArrayValidator.isArrayValid(null);
  }
  
  @Test(expectedExceptions = {InvalidParameterException.class})
  public void isArrayValidWhenArraIsNull() {
	  CustomArray customArray = new CustomArray(1);
	  customArray.setArray(null);
	  customArrayValidator.isArrayValid(customArray);
  }
  
  @Test(expectedExceptions = {InvalidParameterException.class})
  public void isArrayValidWhenArraIsEmpty() {
	  CustomArray customArray = new CustomArray(1);
	  customArray.setArray(new int[0]);
	  customArrayValidator.isArrayValid(customArray);
  }
}
