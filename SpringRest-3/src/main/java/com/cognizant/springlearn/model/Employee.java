package com.cognizant.springlearn.model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {
	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);
	public String id;
	public String name;
	public double salary;
	public Department department;
	public Employee(String id, String name, double salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {
		super();
	}
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
	public double getSalary() {
		LOGGER.debug("getSalary");
		return salary;
	}
	public void setSalary(double salary) {
		LOGGER.debug("setSalary");
		this.salary = salary;
	}
	public Department getDepartment() {
		LOGGER.debug("getDepartment");
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
		LOGGER.debug("setDepartment");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
}

