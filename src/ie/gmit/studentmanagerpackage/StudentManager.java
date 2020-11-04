package ie.gmit.studentmanagerpackage;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	// Create Student ArrayList
	private List<Student> stuObjArrList = null;

	// Constructor
	public StudentManager() {
		stuObjArrList = new ArrayList<Student>();
	}

	// Student Add Method
	public boolean addStudent(Student studentObject) {
		
		// Loop over all Students and check if new Students is already on List
		for (Student studnetObject : stuObjArrList) {
			if (studnetObject.getStudentId().equals(studentObject.getStudentId())) {
				System.out.println("Student NOT Added to Studnet List. Student already on Studnet List!");
				return false;
			}
		}
		
		return stuObjArrList.add(studentObject);

	}

	// Student Remove Method
	public boolean removeStudent(Student studentObject) {
		return stuObjArrList.remove(studentObject);
	}

}
