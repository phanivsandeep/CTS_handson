
package com.cognizant.springlearn.model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Department {
	private static final Logger LOGGER = LoggerFactory.getLogger(Department.class);
	@Id
	@NotNull
	public long id;
	@NotNull
	@NotBlank
	@Size(min=1,max=30)
	public String name;
	public Department(@NotNull long id, @NotNull @NotBlank @Size(min = 1, max = 30) String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department() {
		super();
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
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}