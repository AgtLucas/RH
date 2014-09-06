package gov.cia.careers.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Candidate {

	private int id;
	private String name;
	private int age;
	private float salaryRequirements;
	private String selfAssessment;
	private CandidateEducation education;
	private CandidateStatus status;

	@XmlElementWrapper(name = "histories")
	@XmlElement(name = "history")
	private List<CandidateHistory> history;

	public Candidate() {
		super();
	}

	public Candidate(int id, String name, int age, float salaryRequirements,
			String selfAssessment, CandidateEducation education,
			CandidateStatus status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salaryRequirements = salaryRequirements;
		this.selfAssessment = selfAssessment;
		this.education = education;
		this.status = status;
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

	public CandidateEducation getEducation() {
		return education;
	}

	public void setEducation(CandidateEducation education) {
		this.education = education;
	}

	public CandidateStatus getStatus() {
		return status;
	}

	public void setStatus(CandidateStatus status) {
		this.status = status;
	}

	public List<CandidateHistory> getHistory() {
		return history;
	}

	public void setHistory(List<CandidateHistory> history) {
		this.history = history;
	}

}
