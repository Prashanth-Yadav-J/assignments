package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatements {

	public static void main(String[] args) throws FileNotFoundException {
		
		// println: Prints entire statement and goes to next line
		System.out.println("Prints the entire statement and goes to next line");
		
		// print: Prints entire statement and remains in same line
		System.out.print("Statement 1");
		System.out.print("Statement 2");
	    System.out.println();
	    
	    // printf: Need not modify entire statement
	    System.out.printf("%s role is SW Quality Engineer 3 , Quicklook ID is %d and current employee status is %b","Prashanth",185108,true);
	    System.out.println();
	    
	    // err: Prints text in error style with red colour
	    System.out.println();
	    System.err.println("There is error at line 19.");
	    
	    // printing the logs
	    Logger logger=Logger.getLogger("Prashanth Logger");
	    logger.info("Main method started execution and program execution progress is going well.");
	    System.out.println();
	    System.out.println();
	    logger.warning("Unable to proceed further at test method.");
	    
	    // printing and exporting logs into an text file
        PrintWriter logger1=new PrintWriter("C:\\Automationtraining\\JavaTraining\\Prashanthlogger.txt");
        logger1.println("Println got executed");
        logger1.println("Print got executed");
        logger1.println("Printf got executed");
        logger1.println("Error got executed");
        logger1.println("Logger got executed");
        logger1.println("Class executed successfully");
        logger1.close();
	}

}
