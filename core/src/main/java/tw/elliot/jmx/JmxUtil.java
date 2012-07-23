package tw.elliot.jmx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName="elliot:name=jmxUtil")
public class JmxUtil {
	private static final Logger logger = LoggerFactory.getLogger(JmxUtil.class);
	private static boolean shutdownFlag = false;
	@ManagedOperation
	public Boolean view(String msg) {
		logger.info(msg);
		return Boolean.TRUE;
	}
	
	@ManagedOperation
	public Boolean shutdown() {
		shutdownFlag = true;
		return Boolean.TRUE;
	}
	
	public static final boolean getShutdownFlag() {
		return shutdownFlag;
	}
}
