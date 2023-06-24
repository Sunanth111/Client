package ClinicManagementSystem;

import java.sql.*;
import java.util.Scanner;

import javaapi.ClinicManagementAPI;




public class Login {
	//Database db = new Database();
	Scanner sc = new Scanner(System.in);
//	public  void LoginDetails() throws Exception {
//		String url = "jdbc:mysql://localhost:3306/ClinicManagementSysytem" ;
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con = DriverManager.getConnection(url,"root","");
//		Statement st = con.createStatement();
//	
//		String query = "insert into loginID(loginId,users) values(1,'ADMIN'),(2,'STAFF')";
//		int rs =st.executeUpdate(query);
//		
//		if (rs == 1)
//	        System.out.println(
//	            "inserted successfully : " + query);
//	    else
//	        System.out.println("insertion failed");
//	}
	
		
	
		public boolean newUser(ClinicManagementAPI obj) throws Exception {
			
			System.out.println("Enter the StaffId");
			int staffId = sc.nextInt();
			System.out.println("Enter the username");
			String username = sc.next();
			System.out.println("Enter the password");
			String password = sc.next();
//			String url = "jdbc:mysql://localhost:3306/ClinicManagementSysytem" ;
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection con = DriverManager.getConnection(url,"root","");
//			Statement st = con.createStatement();
	
			Object[] newuser = obj.newlogin(staffId, username, password);

			for(int i =0;i<newuser.length;i++) { 
			System.out.print(newuser[i]+" ");
			}
			
			return true;
			
		      
		}
		public boolean verify(ClinicManagementAPI obj) throws Exception {
			System.out.println("enter the staffId");
			int loginId = sc.nextInt();
			System.out.println("enter the username");
			String username = sc.next();
			System.out.println("enter the password");
			String password = sc.next();
			
			Object[] V =obj.login(username,password);

			for(int i =0;i<V.length;i++) { 
			System.out.print(V[i]+" ");
			}
			return true;
			
			
		}

		

	
}
