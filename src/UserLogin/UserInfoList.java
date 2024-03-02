package UserLogin;

import java.util.Scanner;

public class UserInfoList extends AdminPage {
	private Scanner sc;

	public static void main(String[] args) {
		
		UserInfoList obj= new UserInfoList();
		 UserInfo [] info =obj.addUsers();
		 obj.getInfo(info);
		
	}

	
	public void getInfo(UserInfo [] info)
	{
		for(UserInfo users: info)
		{
			System.out.println("User Information is : "+ users);
		}
		
	}
	
	public UserInfo[] addUsers()
	{
		UserInfo info1 = new UserInfo();
		
		sc = new Scanner(System.in);
		
		
//
//		System.out.println("Enter User Email");
//		String email = sc.nextLine();
//		info1.setEmail(email);
//		
//		System.out.println("Enter User name");
//		String name = sc.nextLine();
//		info1.setName(name);
		
		System.out.println("Enter User Pasword");
		String password = sc.nextLine();
		info1.setPassword(password);
		
		System.out.println("Enter User id");
		int id = sc.nextInt();
		info1.setUserId(id);
		
		
		
//UserInfo info2 = new UserInfo();
//		
//	Scanner	sc2 = new Scanner(System.in);
//		
//		
//		
//		System.out.println("Enter User Pasword");
//		String password2 = sc2.nextLine();
//		info2.setPassword(password2);
//		
//		System.out.println("Enter User id");
//		int id2 = sc2.nextInt();
//		info2.setUserId(id2);
//		
	 	UserInfo[] userArr = new UserInfo[1];
	
		userArr[0]=info1;
//		userArr[1]=info2;
		
		return userArr;
	
	}
}
