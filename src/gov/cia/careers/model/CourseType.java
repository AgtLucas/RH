package gov.cia.careers.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "course-type")
public enum CourseType {
	
	@XmlEnumValue("vocational")
	VOCATIONAL,
	
	@XmlEnumValue("technical")
	TECHNICAL,
	
	@XmlEnumValue("superior")
	SUPERIOR,
	
	@XmlEnumValue("idiom")
	IDIOM,
	
	@XmlEnumValue("graduate")
	GRADUATE;

}
