package ie.gmit.studentmanagerpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager {

	
	// Create Student Array
	//private Student[] studentObjectArray = null;
	private List<Student> stuObjArrList = null;
	
	
	// Constructor
	public StudentManager() {
		stuObjArrList = new ArrayList<Student>();
	}
	
	// Student Add Method
	public boolean addStudent(Student studentObject) {
		return stuObjArrList.add(studentObject);
	}
	
	// Student Remove Method
	public boolean removeStudent(Student studentObject) {
		return stuObjArrList.remove(studentObject);
	}
	
}
