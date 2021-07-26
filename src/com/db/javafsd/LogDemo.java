package com.db.javafsd;

import java.util.logging.Logger;

public class LogDemo {

	private final static Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {

		LOG.info("Start");
		LOG.warning("Something is not right.");
		LOG.info("End");

	}

}
