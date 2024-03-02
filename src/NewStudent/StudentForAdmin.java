package NewStudent;

import java.util.Scanner;

import NewBook.BookOptions;
import UserLogin.AdminPage;

public class StudentForAdmin extends BookOptions{
	
	private static Students[] studentInfo; 
	
	public static void main(String[] args) {
		StudentForAdmin obj = new StudentForAdmin();
		 Students[] info=	obj.addStudens();
		 obj.displayInfo(info);
	}
	
	 public void displayInfo(Students[] info) {
	        for (Students user : info) {
	            System.out.println("User Information is : " + user);
	        }
	    }

	    // Method to add students
	    public Students[] addStudens() {
	        Students[] userArr = new Students[1];

	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < userArr.length; i++) {
	            Students info = new Students();

	            System.out.println("Enter User id");
	            int id = sc.nextInt();
	            info.setStudentId(id);

	            System.out.println("Enter User Name");
	            String name = sc.next();
	            info.setName(name);

	            System.out.println("Enter User Rollno");
	            int rno = sc.nextInt();
	            info.setRollNo(rno);

	            System.out.println("Enter User MobileNumber");
	            String mobNo = sc.next();
	            info.setMob(mobNo);

	            userArr[i] = info;
	        }

	        System.out.println("Data saved Successfully");
	        return userArr;
	    }
	    
	    public void StudentOption() {
	        Scanner scanner = new Scanner(System.in);
	        char ch;
	        
	        do {
	            System.out.println("**************************************** Student Page ****************************************");

	            System.out.println(" 1. Add Student");
	            System.out.println(" 2. Display all students");
	            System.out.println(" 3. Exit ");

	            System.out.println("Enter any option");
	            ch = scanner.nextLine().charAt(0);

	            switch (ch) {
	                case '1':
	                    System.out.println("Student details");
	                    System.out.println();
	                    AddStudents obj1 = new StudentPage();
	                    studentInfo = obj1.addStudens(); // Store student information
	                    break;
	                case '2':
	                    if (studentInfo != null) {
	                        System.out.println("Student Information");
	                        AddStudents obj2 = new AddStudents(); // Create an instance of AddStudents class
	                        obj2.displayInfo(studentInfo); // Display student information
	                    } else {
	                        System.out.println("No student information available. Please add students first.");
	                    }
	                    break;
	                case '3':
	                    System.out.println("Directed to Admin page...");
	                    AddStudents obj3 = new StudentPage();
	                    obj3.Admin();
	                    
	                    break;
	                default:
	                    System.out.println("Invalid option. Please choose a valid option.");
	            }
	        } while (ch != '3');
	    }
	    

}
