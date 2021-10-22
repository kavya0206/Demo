package Alpha;
import org.apache.logging.log4j.*;

public class Demo {

	//entire path of the class - Demo.class.getName()
	private static Logger log = LogManager.getLogger(Demo.class.getName()); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I have clicked on button");
			log.info("button is diplayed");
		log.error("Button is not clicked");
		
		log.fatal("button is missing");
		log.fatal("Alpha");

	}

}
