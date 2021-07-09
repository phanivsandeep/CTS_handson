package com.cognizant.springlearn.model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Department {
	private static final Logger LOGGER = LoggerFactory.getLogger(Department.class);
	public String id;
	public String name;
	public String location;
	public String getId() {
		LOGGER.debug("getId");
		return id;
	}
	public void setId(String id) {
		LOGGER.debug("setId");
		this.id = id;
	}
	public String getName() {
		LOGGER.debug("getName");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("setName");
		this.name = name;
	}
	public String getLocation() {
		LOGGER.debug("getLocation");
		return location;
	}
	public void setLocation(String location) {
		LOGGER.debug("setLocation");
		this.location = location;
	}
	public Department(String id, String name, String location) {
		super();
		LOGGER.debug("Department()");
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	

}
