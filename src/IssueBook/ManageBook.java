package IssueBook;

import java.util.Scanner;

import NewBook.AddBook;
import NewBook.BookOptions;
import NewBook.BookPage;
import NewStudent.AddStudents;
import NewStudent.StudentPage;
import UserLogin.HomePage;
import UserLogin.UserInfo;
import UserLogin.UserInfoList;

public class ManageBook extends BookIssued {
    private static IssueBookData[] bookInfo1;

    public static void main(String[] args) {
        ManageBook obj = new ManageBook();
        obj.manageBookOption();
    }

    public void manageBookOption() {
        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.println(
                    "**************************************** Book Page ****************************************");

            System.out.println(" 1. Issue Book");
            System.out.println(" 2. Return Books");
            System.out.println(" 3. Exit ");

            System.out.println("Enter any option");
            ch = scanner.nextLine().charAt(0);

            switch (ch) {
                case '1':
                    System.out.println("Issued Book to Student");
                    System.out.println();
                    BookIssued obj1 = new ManageBook();
                    bookInfo1 = obj1.issuedBooks(); // Store Book information
                    break;
                case '2':
                    if (bookInfo1 != null) {
                        System.out.println("Books Information");
                        ManageBook obj2 = new ManageBook(); // Create an instance of AddBook class
                        obj2.returnBookInfo();// Display Book information
                    } else {
                        System.out.println("No Book information available. Please add Books first.");
                    }
                    break;
                case '3':
                    System.out.println("Directed to Library Management  page...");
                    AddStudents obj3 = new StudentPage();
                    obj3.libraryPage();

                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        } while (ch != '3');
    }

    public void returnBookInfo() {

        BookIssued obj4 = new ManageBook();
        // obj3.getInfo(userInfo);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student id");
        int id1 = sc.nextInt();

        System.out.println("Enter Book Name");
        String book = sc.next();

        int check = 0;

        for (IssueBookData issueBookData : bookInfo1) {
            if (id1 == issueBookData.getRollNo() && book.equalsIgnoreCase(issueBookData.getBookName())) {
                check = issueBookData.getRollNo();
                // System.out.println("Return Successful");
                // System.out.println(issueBookData);
                System.out.println("Return Book Id : " + issueBookData.getRollNo() + " , Book Name : "
                        + issueBookData.getBookName());

                // obj4.displayInfo(bookInfo1);
            }

        }
        if (check != 0) {

            System.out.println("Return Successful");

        } else {
            System.out.println("You have entered incorrect id or name :  Return Unsuccessful");
        }

    }
}
