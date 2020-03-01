package com.klu.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
	public static final Logger LOGGER=LogManager.getLogger(CompoundInterest.class);
	public CompoundInterest(int p,int t,int r)
	{
		int ci=(int)Math.pow(p*(1+(r/100)),t);
		LOGGER.error(ci);
	}

}
