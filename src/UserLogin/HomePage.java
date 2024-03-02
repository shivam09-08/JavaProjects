package UserLogin;

import java.util.Scanner;

import NewStudent.Students;

public class HomePage extends UserInfoList{
	
	 private static UserInfo [] userInfo; // Store student information
	
	public static void main(String[] args) {
		HomePage obj = new HomePage();
		obj.libraryPage();
	
	} 
	
	public void libraryPage()
	{
		
		char ch;
	do {
		System.out.println("**************************************** Library Management Application ****************************************");
	
		
		
		System.out.println(" 1. Login");
		System.out.println(" 2. Sign Up");
		System.out.println(" 3. Exit ");
		
		System.out.println(" Enter any option");
		 Scanner options = new Scanner(System.in);
		  ch = options.nextLine().charAt(0);
		 switch(ch)
			{
			case '1':
				if(userInfo !=null) {
				System.out.println("Login details");
				System.out.println();
				HomePage obj1 =new HomePage();
				obj1.login();
				}
				else {
                    System.out.println("No User information available. Please add students first.");
                }
//				obj1.adminPage();
				break;
			case '2':
				System.out.println("Sign Up");
				UserInfoList obj2 =new HomePage();	
				//obj2.addUsers();
			  userInfo =obj2.addUsers();
			
				break;
			case '3':
				System.out.println("Exit");
				System.exit(0);
				break;
			
			default:
			System.out.println(options +  " " + "is  not a valide option ");
			}	
	}while (ch != '3');
	}

	public void login()
	{
		
		UserInfoList obj3 =new HomePage();
//		obj3.getInfo(userInfo);
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user id");
		int id1 = sc.nextInt();	
		
		System.out.println("Enter Password");
		String password1 = sc.next();
		
		
		for (UserInfo userInfo2 : userInfo) {
			 if(id1 == userInfo2.getUserId() && password1.equalsIgnoreCase(userInfo2.getPassword()))
				{
					System.out.println("Login Successful :  Welcome Admin");
					
					obj3.Admin();
					
				}
				else {
					System.out.println("You have entered incorrect id or password :  Login Unsuccessful");
				}
			
		}
			
		
	}
	}
	
//	void adminPage()
//	{
//System.out.println("**************************************** Admin Page ****************************************");
//		
//		
//		System.out.println(" 1. Student Records");
//		System.out.println(" 2. Book Records");
//		System.out.println(" 3. Manage Books ");
//		System.out.println(" 4. Exit ");
//		
//		System.out.println(" Enter any option");
//		 Scanner options = new Scanner(System.in);
//		 char ch = options.nextLine().charAt(0);
//		 switch(ch)
//			{
//			case '1':
//				System.out.println(" Student Records");
//				HomePage obj1 =new HomePage();
//				obj1.login();
//				break;
//			case '2':
//				System.out.println("Book Records Up");
//				UserInfoList obj2 =new HomePage();			
//				 UserInfo [] info =obj2.addUsers();
//				obj2.getInfo(info);
//				break;
//			case '3':
//				System.out.println(" Student Records");
//				HomePage obj3 =new HomePage();
//				obj3.login();
//				break;
//				
//			case '4':
//				System.out.println("Exit");
//				System.exit(0);
//				break;
//			
//			default:
//			System.out.println(options +  " " + "is  not a valide option ");
//			}	
//	}
		
	
	
	
	

