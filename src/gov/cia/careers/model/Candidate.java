package gov.cia.careers.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Candidate {

	private int id;
	private String name;
	private int age;
	private float salaryRequirements;
	private String selfAssessment;
	private CourseType courseType;
	private CandidateStatus status;
	private List<Job> jobs;
	private List<Course> courses;

	public Candidate() {
		super();
	}

	public Candidate(int id, String name, int age, float salaryRequirements,
			String selfAssessment, CourseType courseType,
			CandidateStatus status, List<Job> jobs, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salaryRequirements = salaryRequirements;
		this.selfAssessment = selfAssessment;
		this.courseType = courseType;
		this.status = status;
		this.jobs = jobs;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalaryRequirements() {
		return salaryRequirements;
	}

	public void setSalaryRequirements(float salaryRequirements) {
		this.salaryRequirements = salaryRequirements;
	}

	public String getSelfAssessment() {
		return selfAssessment;
	}

	public void setSelfAssessment(String selfAssessment) {
		this.selfAssessment = selfAssessment;
	}

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public CandidateStatus getStatus() {
		return status;
	}

	public void setStatus(CandidateStatus status) {
		this.status = status;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
