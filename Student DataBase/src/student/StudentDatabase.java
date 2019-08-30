package student;
import java.util.Scanner;

public class StudentDatabase {

	public static void main (String[]args) {
	

	
	// ask the user how many new students they want to add 
	System.out.print("how many new students will you like to enrol ?");
	Scanner in = new Scanner(System.in);
	int numOfStudents = in.nextInt();
	Students[] students = new Students[numOfStudents];
	
	// create n number of students 
	for (int n = 0 ; n < numOfStudents;n++) {
		students[n] = new Students();
		students[n].enroll();
		students[n].payBalance();
		System.out.print(students[n].toString());
	}
	
	
	}
}
