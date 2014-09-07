package gov.cia.careers.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "course-status")
public enum CourseStatus {
	
	@XmlEnumValue("attending")
	ATTENDING,
	
	@XmlEnumValue("quit")
	QUIT;

}
