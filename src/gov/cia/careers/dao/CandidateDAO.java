package gov.cia.careers.dao;

import gov.cia.careers.model.Candidate;
import gov.cia.careers.model.CandidateStatus;
import gov.cia.careers.model.Course;
import gov.cia.careers.model.CourseType;
import gov.cia.careers.model.Job;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CandidateDAO {
	
	private static List<Candidate> candidates = new ArrayList<Candidate>();
	
	static {
		
		Candidate ca1 = new Candidate();
		Candidate ca2 = new Candidate();
		
		Course co1 = new Course();
		Course co2 = new Course();
		
		Job job1 = new Job();
		Job job2 = new Job();
		
		ArrayList<String> act1 = new ArrayList<>();
		ArrayList<String> act2 = new ArrayList<>();
		
		ArrayList<Job> j1 = new ArrayList<>();
		ArrayList<Job> j2 = new ArrayList<>();
		
		ArrayList<Course> course1 = new ArrayList<>();
		ArrayList<Course> course2 = new ArrayList<>();
		
		act1.add("Stalk");
		act1.add("Fast Shot");
		act1.add("Long Shot");
		
		act2.add("Defense Tatics");
		act2.add("Run");
		act2.add("Lie");
		
		ca1.setName("Major John Casey");
		ca2.setName("Agt. Sarah Walker");
		
		ca1.setId(1);
		ca2.setId(2);
		
		ca1.setAge(40);
		ca1.setAge(28);
		
		ca1.setSalaryRequirements(182300);
		ca2.setSalaryRequirements(203210);
		
		ca1.setCourseType(CourseType.SUPERIOR);
		ca2.setCourseType(CourseType.SUPERIOR);
		
		ca1.setStatus(CandidateStatus.EMPLOYED);
		ca2.setStatus(CandidateStatus.EMPLOYED);
		
		ca1.setSelfAssessment("Professional Killer. Ex Navy Seal");
		ca2.setSelfAssessment("Professional Spy.");
		
		job1.setAdmission(new Date());
		job2.setAdmission(new Date());
		
		job1.setResignation(new Date());
		job2.setResignation(new Date());
		
		job1.setCity("Washington DC");
		job2.setCity("Washington DC");
		
		job1.setActivities(act1);
		job2.setActivities(act2);
		
		j1.add(job1);
		j2.add(job2);
		
		co1.setName("Tatical Tatics");
		co2.setName("Self Defense");
		
		co1.setInstitution("Mi6");
		co2.setInstitution("NSA");
		
		co1.setLocation("Mi6/SIS HQ - England");
		co2.setLocation("NSA HQ");
		
		co1.setType(CourseType.TECHNICAL);
		co2.setType(CourseType.TECHNICAL);
		
		course1.add(co1);
		course1.add(co2);
		
		ca1.setCourses(course1);
		ca2.setCourses(course2);
		
		candidates.add(ca1);
		candidates.add(ca2);
		
	}
	
	public List<Candidate> listCandidates() {
		return candidates;
	}
	
	public List<Candidate> listCandidatesById(int candidateId) {
		
		List<Candidate> rCandidates = new ArrayList<Candidate>();
		
		for (Candidate c: candidates) {
			if (candidateId == c.getId()) {
				rCandidates.add(c);
			}
		}
		
		return rCandidates;
		
	}

}
