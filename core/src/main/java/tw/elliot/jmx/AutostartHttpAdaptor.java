package tw.elliot.jmx;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx4j.tools.adaptor.http.HttpAdaptor;

public class AutostartHttpAdaptor extends HttpAdaptor {
	
	private static final Logger logger = LoggerFactory.getLogger(AutostartHttpAdaptor.class);
	@Override
	public void postRegister(Boolean registrationDone) {
		super.postRegister(registrationDone);
		
		if (!registrationDone) {
			logger.warn("HttpAdapto should not invoke start with registration success.");
			return;
		}
		
		logger.info("Post Register HttpAdaptor('"+registrationDone+"'):");

		try {
			this.start();
		} catch (IOException e) {
			logger.error("HttpAdaptor startup has been failed.", e);
		}
	}

	@Override
	public void postDeregister() {
		super.postDeregister();
		logger.info("Post Deregister HttpAdaptor():");
		this.stop();
	}
	
}