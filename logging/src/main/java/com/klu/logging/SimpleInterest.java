package com.klu.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	public static final Logger LOGGER=LogManager.getLogger(SimpleInterest.class);
	public SimpleInterest(int p,int t,int r) {
		int si=(p*t*r)/100;
		LOGGER.error(si);
	}
}
