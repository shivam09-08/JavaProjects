package UserLogin;



public class UserInfo {
	private int userId ;
	private String name;
	private String email;
	private	String password ;
	
	
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
