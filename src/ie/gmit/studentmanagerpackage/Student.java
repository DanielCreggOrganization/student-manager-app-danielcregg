package ie.gmit.studentmanagerpackage;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Instance Variables
	private String studentId;
	private String firstName;
	private String surname;
	private int yearOfStudy;
	
	// Constructor
	public Student(String studentId) {
		this.studentId = studentId;
	}
	
	public Student(String studentId, String firstName, String Surname) {
		this(studentId);
		this.firstName = firstName;
		this.surname = Surname;
	}

	public Student(String studentId, String firstName, String Surname, int yearOfStudy) {
		this(studentId, firstName, Surname);
		this.yearOfStudy = yearOfStudy;
	}
	
	// Getters and Setters
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
}
