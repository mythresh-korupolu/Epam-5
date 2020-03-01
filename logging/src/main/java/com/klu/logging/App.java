package com.klu.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	 int p= 18;
         int t = 12;
         int r=123;
         SimpleInterest SI=new SimpleInterest(p,t,r);
         CompoundInterest CI=new CompoundInterest(p,t,r);
    }
}
