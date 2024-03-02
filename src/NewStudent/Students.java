package NewStudent;

public class Students {
	int studentId;
	String mob ;
	int rollNo;
	String name;
	
	public int getStudentId() {
		return studentId;
	}
	public String getMob() {
		return mob;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", mob=" + mob + ", rollNo=" + rollNo + ", name=" + name + "]";
	}

	
}
