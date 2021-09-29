package by.training.first_task_arrays;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	static Logger logger = LogManager.getLogger();
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        logger.error("IOException");
    }
}
