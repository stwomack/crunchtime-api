package io.crunchtime.rest.jersey;

import io.crunchtime.rest.resources.MeetingResourceImpl;

import java.util.logging.Logger;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

public class JerseyApplication extends ResourceConfig {

	/**
	 * Registers JAX-RS services with the jersey servlet.
	 */
	public JerseyApplication() {
		// Disable the send error in response so that the exception mappers can make true XML and so that our mappers can create incidents in the incident service
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, false);
	    property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
	    register(JacksonFeature.class);
	    register(MeetingResourceImpl.class);
	    
	    //Resources
		
		// Add our Jersey log4j wrapper to enable logging of the request/response payloads to our standard
		// Log4j Logger
        Logger rootLogger = Logger.getLogger("");
        rootLogger.addHandler(new JerseyLog4jLoggerWrapper());
	}
}