package NewBook;

import java.util.Scanner;

public class AddBook extends IssuuedBookLinkNewBook {
    public static void main(String[] args) {
        AddBook obj = new AddBook();
        BookPage[] info = obj.addBooks();
        obj.displayInfo(info);

    }

    // Method to display information
    public void displayInfo(BookPage[] info) {
        for (BookPage books : info) {
            System.out.println("User Information is : " + books);
        }
    }

    // Method to add students
    public BookPage[] addBooks() {
        BookPage[] bookArr = new BookPage[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < bookArr.length; i++) {
            BookPage info = new BookPage();

            System.out.println("Enter book id");
            int id = sc.nextInt();
            info.setBookId(id);

            System.out.println("Enter book Name");
            String name = sc.next();
            info.setBookName(name);

            bookArr[i] = info;
        }

        System.out.println("Data saved Successfully");
        return bookArr;
    }
}
