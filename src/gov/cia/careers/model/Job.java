package gov.cia.careers.model;

import java.util.Date;
import java.util.List;

public class Job {

	private float salary;
	private String company;
	private String city;
	private Date admission;
	private Date resignation;
	private List<String> activities;

	public Job() {
		super();
	}

	public Job(float salary, String company, String city, Date admission,
			Date resignation, List<String> activities) {
		super();
		this.salary = salary;
		this.company = company;
		this.city = city;
		this.admission = admission;
		this.resignation = resignation;
		this.activities = activities;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getAdmission() {
		return admission;
	}

	public void setAdmission(Date admission) {
		this.admission = admission;
	}

	public Date getResignation() {
		return resignation;
	}

	public void setResignation(Date resignation) {
		this.resignation = resignation;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

}
