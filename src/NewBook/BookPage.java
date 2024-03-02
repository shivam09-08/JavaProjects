package NewBook;

public class BookPage {
	int bookId;
	String bookName;
	
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "BookPage [bookId=" + bookId + ", bookName=" + bookName + "]";
	}

}
