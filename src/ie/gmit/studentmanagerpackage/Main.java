package ie.gmit.studentmanagerpackage;

import java.io.File;

/**
 * The Main class holds the main method.
 */
public class Main {
	
	// Main method containing print statement.
	public static void main(String[] args) {
		
		// Create menu object
		//Menu menuObject = new Menu();
		// Run menu start method
		//menuObject.start();#
		boolean addStatus;
		
		StudentManager stuManObj = new StudentManager();
		File studentCSVFile = new File(".\\resources\\students.csv");
		stuManObj.loadStudentsFromCSVFile(studentCSVFile);
		System.out.println(stuManObj.findTotalStudents());
		
		Student studentObj1 = new Student("G00123461","Jim","Jones",1);
		stuManObj.addStudent(studentObj1);
		System.out.println(stuManObj.findTotalStudents());
		
		stuManObj.saveStudentsToCSVFile(studentCSVFile);
		
//		Student studentObj1 = new Student("G00123458","Alf","Stewart",3);
//    	Student studentObj2 = new Student("G00123459","Sally","Fletcher",4);
		
//		addStatus = stuManObj.addStudent(studentObj1);
//		System.out.println(addStatus);
//		addStatus = stuManObj.addStudent(studentObj2);
//		System.out.println(addStatus);
//		addStatus = stuManObj.addStudent(studentObj3);
//		System.out.println(addStatus);
		
		//boolean removeStatus = stuManObj.removeStudent(studentObj2);
		
		//System.out.println(removeStatus);
		
		System.out.println("The End");
		
		
		
		
	} // End main method
	
} // End Main Class
