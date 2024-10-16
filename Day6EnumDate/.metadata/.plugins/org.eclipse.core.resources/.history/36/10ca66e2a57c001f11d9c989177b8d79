import java.util.Date;

import com.cdac.acts.courseenum.CourseEnum;
import com.cdac.acts.utils.DateUtils;

public class Student {
	
	private int rno;
	private String name;
	private double marks;
	private CourseEnum course;
	private Date dob;
	
	private static int rnoGen = 1;
	 
	public Student(){
		this.rno = rnoGen++;
		this.name = "";
		this.marks = 0;
		this.course = null;
		this.dob = null;
	}
	
	public Student(String name, double marks, CourseEnum course, Date dob) {
		this.rno = rnoGen++;
		this.name = name;
		this.marks = marks;
		this.course = course;
		this.dob = dob;
	}
	
	public int getRno() {
		return this.rno;
	}
	
	public double getMarks() {
		return this.marks;
	}
	
	
	@Override
	public String toString() {
		
		return "Student Data: [ Student Roll No: " + rno 
				+ " , Student Name: " + name 
				+ " , Marks: " + marks 
				+ " , Course: " + course.getValue()
				+ " , Date of Birth: " + DateUtils.formatDate(dob)
				+ " ]";
		
	}
	
}
