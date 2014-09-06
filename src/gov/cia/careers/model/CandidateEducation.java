package gov.cia.careers.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "education")
public enum CandidateEducation {
	
	@XmlEnumValue("basic")
	BASIC,
	
	@XmlEnumValue("secondary")
	SECONDARY,
	
	@XmlEnumValue("graduation")
	GRADUATION;

}
