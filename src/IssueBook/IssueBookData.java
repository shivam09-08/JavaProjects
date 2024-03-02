package IssueBook;

public class IssueBookData {
	
	int rollNo;
	String bookName;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "IssueBookData [rollNo=" + rollNo + ", bookName=" + bookName + "]";
	}
}
