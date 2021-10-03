package test.by.training.first_task_arrays.filter;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

import by.training.first_task_arrays.exception.CustomException;
import by.training.first_task_arrays.filter.ContentFilter;

public class ContentFilterTest {
	private ContentFilter contentFilter = new ContentFilter();
	private List<String>linesList = new ArrayList<String>();
	
	
  @Test (expectedExceptions = {CustomException.class})
  public void filterFistValidLineNoLinesTest() throws CustomException {
	  contentFilter.filterFistValidLine(linesList);
  }
  
  @Test
  public void filterFistValidLineTest() throws CustomException {
	  linesList.add("1 2 3");
	  linesList.add("4i5 6");
	  linesList.add("7 8 0");
	  
	  String expected = "1 2 3";
	  String actual = contentFilter.filterFistValidLine(linesList);
	  
	  assertTrue(expected.equals(actual));
  }
}
