package acrovia;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jExample{
  /* Get actual class name to be printed on */
  static Logger log = Logger.getLogger(
                      Log4jExample.class.getName());
  
 

  public static void main(String[] args)
                throws IOException,SQLException{
   
	 DOMConfigurator.configure("log4j/log4j.xml");
     log.debug("Hello this is an debug message");
     log.info("Hello this is an info message");
     
     log.debug("Sample debug message");
     
     log.info("Sample info message");
     
     log.warn("Sample warn message");
     
     log.error("Sample error message");
     
     log.fatal("Sample fatal message");
  }
}