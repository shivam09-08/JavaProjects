package NewStudent;

//import java.util.Scanner;
//
//public class StudentPage extends AddStudents {
//    private static Students[] studentInfo; // Store student information
//
//    public static void main(String[] args) {
//        System.out.println("**************************************** Student Page ****************************************");
//
//        System.out.println(" 1. Add Student");
//        System.out.println(" 2. Display all students");
//        System.out.println(" 3. Exit ");
//
//        System.out.println("Enter any option");
//        Scanner options = new Scanner(System.in);
//        char ch = options.nextLine().charAt(0);
//
//        switch (ch) {
//            case '1':
//                System.out.println("Student details");
//                System.out.println();
//                AddStudents obj1 = new StudentPage();
//                studentInfo = obj1.addStudens(); // Store student information
//                break;
//            case '2':
//                if (studentInfo != null) {
//                    System.out.println("Student Information");
//                    AddStudents obj2 = new AddStudents(); // Create an instance of AddStudents class
//                    obj2.displayInfo(studentInfo); // Display student information
//                } else {
//                    System.out.println("No student information available. Please add students first.");
//                }
//                break;
//            case '3':
//                System.out.println("Exiting...");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Invalid option. Please choose a valid option.");
//        }
//    }
//}



import java.util.Scanner;

public class StudentPage extends AddStudents {
    private static Students[] studentInfo; // Store student information

    public static void main(String[] args) {
    	StudentPage obj = new StudentPage();
    	obj.StudentOption();
    	
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


