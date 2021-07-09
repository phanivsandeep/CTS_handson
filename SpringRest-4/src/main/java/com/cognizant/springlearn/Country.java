package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public String code;
	public String name;
	public Country() {
		LOGGER.debug("Country()");
	}
	public String getCode() {
		LOGGER.debug("getCode");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("setCode");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("getName");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("setName");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	
}