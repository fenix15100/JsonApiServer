package app.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.yahoo.elide.annotation.Include;

@SuppressWarnings("serial")
@Entity
@Table(name="subject")
@Include(rootLevel = true,type = "subject")

public class Subject implements Serializable {
	
	private Integer id;
	
	private String name;
	
	private Integer hours;
	
	private boolean mandatory;
	
	private Set<Course> courses;
	
	
	
	public Subject() {
		
	}
	
	public Subject(Integer id, String name, Integer hours, boolean mandatory, Set<Course> courses) {
		this.id = id;
		this.name = name;
		this.hours = hours;
		this.mandatory = mandatory;
		this.courses = courses;
	}
	
	public Subject(String name, Integer hours, boolean mandatory, Set<Course> courses) {
		this.name = name;
		this.hours = hours;
		this.mandatory = mandatory;
		this.courses = courses;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_subject")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	@ManyToMany(mappedBy = "subjects")
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}


	
	
	
	
	

}
