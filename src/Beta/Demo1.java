package Beta;
import org.apache.logging.log4j.*;

public class Demo1 {

	//entire path of the class - Demo1.class.getName()
	private static Logger log = LogManager.getLogger(Demo1.class.getName()); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am debugging");
		if(5>4)
			log.info("object is present");
		log.error("Object is not present");
		log.info("GIthub");
		log.fatal("Fatal");
		log.info("GIthub112");
	}

}
