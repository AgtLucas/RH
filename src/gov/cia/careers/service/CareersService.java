package gov.cia.careers.service;

import gov.cia.careers.dao.CandidateDAO;
import gov.cia.careers.model.Candidate;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class CareersService {
	
	public List<Candidate> listCandidates() {
		CandidateDAO candidateDAO = getDAO();
		return candidateDAO.listCandidates();
	}
	
	public List<Candidate> listCandidatesById(@WebParam(name="candidate", header=true) int candidate) {
		CandidateDAO candidateDAO = getDAO();
		return candidateDAO.listCandidatesById(candidate);
	}
	
	private CandidateDAO getDAO() {
		return new CandidateDAO();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/candidates", new CareersService());
		System.out.println("Go!");
	}

}
