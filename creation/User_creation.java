package creation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class User_creation implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("USER_CREATION");

	  public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("Processing request by '");
	   
	  }
}
