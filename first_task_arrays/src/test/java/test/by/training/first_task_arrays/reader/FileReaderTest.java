package test.by.training.first_task_arrays.reader;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.List;

import by.training.first_task_arrays.exception.CustomException;
import by.training.first_task_arrays.reader.CustomFileReader;

public class FileReaderTest {
	CustomFileReader customFileReader = new CustomFileReader();
	
  @Test(expectedExceptions = {CustomException.class})
  
  public void readFileExceptionTest() throws CustomException {  
	  customFileReader.readFile("");  
  }
  
  @Test
  public void readFileTest() throws CustomException {
	  final String FILE_NAME = "src/test/resources/testTextFile.txt";
	  List<String> expected = new ArrayList<String>();
	  expected.add("1 2 3");
	  expected.add("4i5 6");
	  
	  List<String> actual = customFileReader.readFile(FILE_NAME);
	  
	  assertTrue(expected.equals(actual));
  }
  @Test
  public void readFileTestEmpty() throws CustomException {
	  final String FILE_NAME = "src/test/resources/testTextFileEmpty.txt";
	  List<String> expected = new ArrayList<String>();

	  
	  List<String> actual = customFileReader.readFile(FILE_NAME);
	  
	  assertTrue(expected.equals(actual));
  }
}