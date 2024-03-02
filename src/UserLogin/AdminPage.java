package UserLogin;

import java.util.Scanner;

import NewStudent.StudentForAdmin;
//import NewBook.BookOptions;
//import IssueBook.ManageBook;

public class AdminPage extends StudentForAdmin {
	
	 private static UserInfo [] userInfo;
	public static void main(String[] args) {
		AdminPage obj =new AdminPage();
		obj.Admin();

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
	
	public void Admin()

	{
		System.out.println("**************************************** Admin Page ****************************************");
		
		
		System.out.println(" 1. Student Records");
		System.out.println(" 2. Book Records");
		System.out.println(" 3. Manage Books ");
		System.out.println(" 4. Exit ");
		
		System.out.println(" Enter any option");
		 Scanner options = new Scanner(System.in);
		 char ch = options.nextLine().charAt(0);
		 switch(ch)
			{
			case '1':
				System.out.println(" Student Records");
				AdminPage obj1 =new AdminPage();
				obj1.StudentOption();
				break;
			case '2':
				System.out.println("Book Records ");
				UserInfoList obj2 =new HomePage();			
//				 UserInfo [] info =obj2.addUsers();
				obj2.BookOption();
				break;
			case '3':
				System.out.println(" Manage Books");
				HomePage obj3 =new HomePage();
				obj3.manageBookOption();
				break;
				
			case '4':
				System.out.println("Exit");
				System.exit(0);
				break;
			
			default:
			System.out.println(options +  " " + "is  not a valide option ");
			}	
	}

	}


