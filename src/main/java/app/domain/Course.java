package app.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import com.yahoo.elide.annotation.Include;


@SuppressWarnings("serial")
@Entity
@Table(name="course")
@Include(rootLevel = true,type = "course")

public class Course implements Serializable {


	private Integer id;
	

	private String name;
	

	private int grade;
	

	private School school;
	
	
    private Set<Subject> subjects;
	

	public Course() {


	}

	public Course(Integer id, String name, int grade, School school, Set<Subject> subject) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.school = school;
		this.subjects = subject;
	}
	
	public Course(String name, int grade, School school, Set<Subject> subject) {
		this.name = name;
		this.grade = grade;
		this.school = school;
		this.subjects = subject;
	}
	
	public Course(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_course")
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@ManyToOne
	@JoinColumn(name="id_school", referencedColumnName="id_school",nullable=true)
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "course_subject", 
        joinColumns = { @JoinColumn(name = "course_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "subject_id") }
    )
	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
}
