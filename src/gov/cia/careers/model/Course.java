package gov.cia.careers.model;

public class Course {

	private int id;
	private String name;
	private String location;
	private String institution;
	private CourseType type;
	private CourseStatus status;

	public Course() {
		super();
	}

	public Course(int id, String name, String location, String institution,
			CourseType type, CourseStatus status) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.institution = institution;
		this.type = type;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public CourseType getType() {
		return type;
	}

	public void setType(CourseType type) {
		this.type = type;
	}

	public CourseStatus getStatus() {
		return status;
	}

	public void setStatus(CourseStatus status) {
		this.status = status;
	}

}
