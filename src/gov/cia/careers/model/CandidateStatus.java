package gov.cia.careers.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "candidate-status")
public enum CandidateStatus {

	@XmlEnumValue("employed")
	EMPLOYED,
	
	@XmlEnumValue("unemployed")
	UNEMPLOYED;
	
}
