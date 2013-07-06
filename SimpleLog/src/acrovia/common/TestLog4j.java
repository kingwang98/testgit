package acrovia.common;

import org.apache.log4j.Logger;



public class TestLog4j {
	 static Logger log = Logger.getLogger(
			 TestLog4j.class.getName());
	
	 
	 public void printout(){
		
		log.info("enter ! " + this.getClass().getName() + "printout()");
		
		 log.debug("Hello this is an debug message");
	     log.info("Hello this is an info message");
	     
	     log.debug("Sample debug message");
	     
	     log.info("Sample info message");
	     
	     log.warn("Sample warn message");
	     
	     log.error("Sample error message");
	     
	     log.fatal("Sample fatal message");
		
		log.info("return !" + this.getClass().getName() + "printout()" );
		
	}

}
