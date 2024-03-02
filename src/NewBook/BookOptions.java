package NewBook;

import java.util.Scanner;

import NewStudent.AddStudents;
import NewStudent.StudentPage;
;

public class BookOptions extends AddBook {
	
	private static BookPage[] bookInfo;
	public static void main(String[] args) {
		
		BookOptions obj=new BookOptions();
		obj.BookOption();
	}

	 public void BookOption() {
	        Scanner scanner = new Scanner(System.in);
	        char ch;
	        
	        do {
	            System.out.println("**************************************** Book Page ****************************************");

	            System.out.println(" 1. Add Book");
	            System.out.println(" 2. Display all Books");
	            System.out.println(" 3. Exit ");

	            System.out.println("Enter any option");
	            ch = scanner.nextLine().charAt(0);

	            switch (ch) {
	            
	                case '1':
	                    System.out.println("Adding Books");
	                    System.out.println();
	                    AddBook obj1 = new BookOptions();
	                    bookInfo = obj1.addBooks(); // Store Book information
	                    break;
	                case '2':
	                    if (bookInfo != null) {
	                        System.out.println("Books Information");
	                        AddBook obj2 = new BookOptions(); // Create an instance of AddBook class
	                        obj2.displayInfo(bookInfo); // Display Book information
	                    } else {
	                        System.out.println("No Book information available. Please add Books first.");
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
