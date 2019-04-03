package com.ibm.selenium.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4j_Test {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(Log4j_Test.class);
		DOMConfigurator.configure("Log4j.xml");

		log.debug("debug");
		log.info("infor message");
		log.warn("warn");
		log.error("error messsage");
		log.fatal("fatal message");
System.out.println();
	}

}
