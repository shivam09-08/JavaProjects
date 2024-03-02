package NewStudent;

import java.util.Scanner;

import UserLogin.AdminPage;
//import UserLogin.HomePage;
//import UserLogin.UserInfo;
//import UserLogin.UserInfoList;

public class AddStudents extends AdminPage{
    
    public static void main(String[] args) {
        AddStudents obj = new AddStudents();
        Students[] info = obj.addStudens();
        obj.displayInfo(info); // Call the method to display information
    }

    // Method to display information
    public void displayInfo(Students[] info) {
        for (Students user : info) {
            System.out.println("User Information is : " + user);
        }
    }

    // Method to add students
    public Students[] addStudens() {
        Students[] userArr = new Students[1];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < userArr.length; i++) {
            Students info = new Students();

            System.out.println("Enter User id");
            int id = sc.nextInt();
            info.setStudentId(id);

            System.out.println("Enter User Name");
            String name = sc.next();
            info.setName(name);

            System.out.println("Enter User Rollno");
            int rno = sc.nextInt();
            info.setRollNo(rno);

            System.out.println("Enter User MobileNumber");
            String mobNo = sc.next();
            info.setMob(mobNo);

            userArr[i] = info;
        }

        System.out.println("Data saved Successfully");
        return userArr;
    }
    
    
//     void Admin()
//     {
//
// 		System.out.println("**************************************** Admin Page ****************************************");
// 		
// 		
// 		System.out.println(" 1. Student Records");
// 		System.out.println(" 2. Book Records");
// 		System.out.println(" 3. Manage Books ");
// 		System.out.println(" 4. Exit ");
// 		
// 		System.out.println(" Enter any option");
// 		 Scanner options = new Scanner(System.in);
// 		 char ch = options.nextLine().charAt(0);
// 		 switch(ch)
// 			{
// 			case '1':
// 				System.out.println(" Student Records");
// 				HomePage obj1 =new HomePage();
// 				obj1.login();
// 				break;
// 			case '2':
// 				System.out.println("Book Records Up");
// 				UserInfoList obj2 =new HomePage();			
// 				 UserInfo [] info =obj2.addUsers();
// 				obj2.getInfo(info);
// 				break;
// 			case '3':
// 				System.out.println(" Student Records");
// 				HomePage obj3 =new HomePage();
// 				obj3.login();
// 				break;
// 				
// 			case '4':
// 				System.out.println("Exit");
// 				System.exit(0);
// 				break;
// 			
// 			default:
// 			System.out.println(options +  " " + "is  not a valide option ");
// 			}	
//     }
}


//public class AddStudents extends Students {
//	
//	public static void main(String[] args) {
//		
//		AddStudents  obj = new AddStudents();
//		Students[] info = obj.addStudens();
//		obj.getInfo(info);
//		
//		
//	}
//	
//	
//	public void getInfo(Students [] info)
//	{
//		for(Students users: info)
//		{
//			System.out.println("User Information is : "+ users);
//		}
//		
//	}
//	
//	public Students[] addStudens()
//	{
//		Students info1 = new Students();
//	Scanner	sc = new Scanner(System.in);
//		
//		System.out.println("Enter User id");
//		int id = sc.nextInt();
//	    info1.setStudentId(id);
//	    
//		System.out.println("Enter User Name");
//		String name = sc.next();
//		info1.setName(name);
//		
//		System.out.println("Enter User Rollno");
//		int rno = sc.nextInt();
//	    info1.setRollNo(rno);
//	    
//	    System.out.println("Enter User MobileNumber");
//		int mobNo = sc.nextInt();
//	    info1.setMob(mobNo);
//	  
//	    Students info2 = new Students();
//	    Scanner	sc1 = new Scanner(System.in);
//
//		System.out.println("Enter User id");
//		int id1 = sc1.nextInt();
//	    info2.setStudentId(id1);
//	    
//		System.out.println("Enter User Name");
//		String name1 = sc1.next();
//		info2.setName(name1);
//		
//		System.out.println("Enter User Rollno");
//		int rno1 = sc1.nextInt();
//		info2.setRollNo(rno1);
//	    
//	    System.out.println("Enter User MobileNumber");
//		int mobNo1 = sc1.nextInt();
//		info2.setMob(mobNo1);
//		
//		
//		 Students info3 = new Students();
//	    Scanner	sc2 = new Scanner(System.in);
//
//		System.out.println("Enter User id");
//		int id2 = sc2.nextInt();
//		info3.setStudentId(id2);
//	    
//		System.out.println("Enter User Name");
//		String name2 = sc2.next();
//		info3.setName(name2);
//		
//		System.out.println("Enter User Rollno");
//		int rno2 = sc2.nextInt();
//		info3.setRollNo(rno2);
//	    
//	    System.out.println("Enter User MobileNumber");
//		int mobNo2 = sc2.nextInt();
//		info3.setMob(mobNo2);
//	    
//	    
//		Students info4 = new Students();
//	    Scanner	sc3 = new Scanner(System.in);
//
//		System.out.println("Enter User id");
//		int id3 = sc3.nextInt();
//		info4.setStudentId(id3);
//	    
//		System.out.println("Enter User Name");
//		String name3 = sc3.next();
//		info4.setName(name3);
//		
//		System.out.println("Enter User Rollno");
//		int rno3 = sc3.nextInt();
//		info4.setRollNo(rno3);
//	    
//	    System.out.println("Enter User MobileNumber");
//		int mobNo3 = sc3.nextInt();
//		info4.setMob(mobNo3);
//		
//	    
//		Students info5 = new Students();
//	    Scanner	sc4 = new Scanner(System.in);
//
//		System.out.println("Enter User id");
//		int id4 = sc4.nextInt();
//		info5.setStudentId(id4);
//	    
//		System.out.println("Enter User Name");
//		String name4 = sc4.next();
//		info5.setName(name4);
//		
//		System.out.println("Enter User Rollno");
//		int rno4 = sc4.nextInt();
//		info5.setRollNo(rno4);
//	    
//	    System.out.println("Enter User MobileNumber");
//		int mobNo4 = sc4.nextInt();
//		info5.setMob(mobNo4);
//		
//	    Students[] userArr = new Students[5];
//	
//		userArr[0]=info1;
//		userArr[1]=info2;
//		userArr[2]=info3;
//		userArr[3]=info4;
//		userArr[4]=info5;
//		
//		
//		System.out.println("Data saved Successful");
//		return userArr;
//	
//	
//	}
//
//}
