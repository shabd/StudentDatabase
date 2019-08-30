package student;
import java.util.Scanner;

public class Students {
	
	private String FirstName;
	private String LastName;
	private int Year;
	private  String StudentId ;
	private String Courses;
	private int Balance=0;
	private int CourseCost =600;
	private static int id = 1000;
	
	
	//constructor get student
	public Students() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEneter student First Name");
		this.FirstName =in.nextLine();
		System.out.print("\nEneter student Last Name");
		this.LastName =in.nextLine();
		System.out.print("\nEneter student Year : \n1 :First Year \n2: Second Year\n3: Third year");
		this.Year =in.nextInt();
		//Setting student id 
		setStrudentId();
		//System.out.print("\nFirst Name :" +FirstName + "\nLast Name:" + LastName+ "\nyear:"+Year + "\nStudentId:" +StudentId);
	
		
	}
	// generate student id 
	private void setStrudentId() {
		// grade level + level 
		this.StudentId = Year + ""+id;	
	}
	
	// enroll in course 
	public void enroll() {
		do {
			
			System.out.print("\nEnter course to Enroll \n Enter Q to Quit");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q") ) {
				Courses =  Courses + "\n" +course;
				//every time course is chosen tuition balance increased
				Balance =Balance + CourseCost;}
			else {
				//System.out.print("break");
				break;
			}
			
		}while(1 != 0);
		
		   // System.out.println("\n enrolled in:" +Courses );
			
	}
	// view Balance 
	public void viewBalance() {
		System.out.println("\nThe Balance is :" + Balance);
	}
	 	// Pay Tuition 
	public void payBalance() {
		viewBalance();
		System.out.print("Enter your payment:");
		Scanner in = new Scanner(System.in);
		int payment=in.nextInt();
		Balance = Balance - payment;
		System.out.println("\nThank you for your payment of :R"+ payment);
		viewBalance();
	}
	// show info 
	public String toString() {
		return "\n FirstName: "+ FirstName + "\n Last Name: " + LastName+ "\n Courses enrolled: " + Courses + "\n Student balance: R"+Balance
				;
	}
	}
	
	
	


