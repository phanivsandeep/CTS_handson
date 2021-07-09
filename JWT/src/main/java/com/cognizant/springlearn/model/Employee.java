package com.cognizant.springlearn.model;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Employee {
	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);
	@Id
	@NotNull
	public long id;
	@NotNull
	@NotBlank
	@Size(min=1,max=30)
	public String name;
	@NotNull
	@Min(value=0)
	public double salary;
	@NotNull
	public String permanent;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	public Date dateOfBirth;
	public Department department;
	public Skill skill;
	public Employee(@NotNull long id, @NotNull @NotBlank @Size(min = 1, max = 30) String name,
			@NotNull @Min(0) double salary, @NotNull String permanent, Date dateOfBirth, Department department,
			Skill skill) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.permanent = permanent;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.skill = skill;
	}
	public long getId() {
		LOGGER.debug("getId");
		return id;
	}
	public void setId(long id) {
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
	public String getPermanent() {
		LOGGER.debug("getPermanent");
		return permanent;
	}
	public void setPermanent(String permanent) {
		LOGGER.debug("setPermanent");
		this.permanent = permanent;
	}
	public Date getDateOfBirth() {
		LOGGER.debug("getDOB");
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		LOGGER.debug("setDOB");
		this.dateOfBirth = dateOfBirth;
	}
	public Department getDepartment() {
		LOGGER.debug("getDepartment");
		return department;
	}
	public void setDepartment(Department department) {
		LOGGER.debug("setDepartment");
		this.department = department;
	}
	public Skill getSkill() {
		LOGGER.debug("getSkill");
		return skill;
	}
	public void setSkill(Skill skill) {
		LOGGER.debug("getSkill");
		this.skill = skill;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + ", department=" + department + ", skill=" + skill + "]";
	}
	
	
}