package edu.fra.uas;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class NDService {
private static final Logger log = LoggerFactory.getLogger(NDService.class);
	
	private String noteString = "preInitialization";
	
	@PostConstruct
    public void postConstruct() {
		log.info("postConstruct() -->  " + noteString);
		noteString = "PostConstruct";
		log.info("postConstruct() -->  " + noteString);
	}
	
	public void doSomething() {
		log.info("doSomething() --> " + noteString);
	}
	
	@PreDestroy
    public void preDestroy() {
		noteString = "PreDestroy";
		log.info("preDestroy() --> " + noteString);
	}
	
}
