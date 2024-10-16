package com.cdac.acts.courseenum;

public enum CourseEnum {
	PG_DAC("Diploma in Advanced Computing"),
	PG_DESD("Diploma in ESD"),
	PG_VLSI("Diploma in VLSI"),
	PG_DITISS("Diploma in DITISS"),
	PG_DAI("Diploma in AI");
	
	
	
	private String course;
	private CourseEnum(String course) {
		this.course = course;
	}
	
	public String getValue() {
		return course;
	} 
	
	
}
