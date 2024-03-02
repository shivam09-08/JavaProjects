package IssueBook;

import java.util.Scanner;

import NewBook.BookPage;

public class BookIssued extends BookPage {
  public static void main(String[] args) {
    BookIssued isu = new BookIssued();
    IssueBookData[] info = isu.issuedBooks();
    isu.displayInfo(info);
  }

  // Method to display information
  public void displayInfo(IssueBookData[] info) {
    for (IssueBookData books : info) {
      System.out.println("Book Information is : " + books);
    }
  }

  // Method to add students
  public IssueBookData[] issuedBooks() {
    IssueBookData[] bookArr = new IssueBookData[2];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < bookArr.length; i++) {
      IssueBookData info = new IssueBookData();

      System.out.println("Enter Student id");
      int id = sc.nextInt();
      info.setRollNo(id);

      System.out.println("Enter book Name");
      String name = sc.next();
      info.setBookName(name);

      bookArr[i] = info;
    }

    System.out.println("Data saved Successfully");
    return bookArr;
  }
}
