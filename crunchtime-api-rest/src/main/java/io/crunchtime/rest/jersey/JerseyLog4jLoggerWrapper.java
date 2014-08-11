package io.crunchtime.rest.jersey;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import org.apache.log4j.Priority;

public class JerseyLog4jLoggerWrapper extends Handler {

	@Override
	public void publish(LogRecord record) {
		String sourceClassName = record.getSourceClassName();
		Level level = record.getLevel();

		// Log either based on org.glassfish.jersey, or any java.util logging
		// that is warning or higher
		if (sourceClassName != null
				&& (level.intValue() >= Level.WARNING.intValue() || sourceClassName
						.contains("org.glassfish.jersey"))) {

			org.apache.log4j.Logger logger = org.apache.log4j.Logger
					.getLogger(sourceClassName);
			logger.log(convertToLog4JPriority(level), record.getMessage());
		}
	}

	private Priority convertToLog4JPriority(Level level) {
		return org.apache.log4j.Level.ALL;
	}

	private Priority convertToLog4JPriority_KEEP(Level level) {
		if (Level.ALL.equals(level)) {
			return org.apache.log4j.Level.INFO;
		} else if (Level.CONFIG.equals(level)) {
			return org.apache.log4j.Level.INFO;
		} else if (Level.FINE.equals(level)) {
			return org.apache.log4j.Level.INFO;
		} else if (Level.FINER.equals(level)) {
			return org.apache.log4j.Level.DEBUG;
		} else if (Level.FINEST.equals(level)) {
			return org.apache.log4j.Level.DEBUG;
		} else if (Level.INFO.equals(level)) {
			return org.apache.log4j.Level.INFO;
		} else if (Level.SEVERE.equals(level)) {
			return org.apache.log4j.Level.ERROR;
		} else if (Level.WARNING.equals(level)) {
			return org.apache.log4j.Level.WARN;
		} else {
			return org.apache.log4j.Level.INFO;
		}
	}

	@Override
	public void flush() {
		// Don't need to do anything
	}

	@Override
	public void close() {
		// Don't need to do anything
	}

}
