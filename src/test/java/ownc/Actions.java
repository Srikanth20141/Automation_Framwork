package ownc;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Actions {

	static Logger logger;

	public static void log(Object message) {
		logger = Logger.getLogger("Actions");
		PropertyConfigurator.configure("log4j.properties");
		logger.info(message);
	}

}
