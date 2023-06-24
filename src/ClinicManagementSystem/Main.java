package ClinicManagementSystem;

import java.sql.*;
import java.util.Scanner;

import javaapi.*;

//import tempApi.ClinicManagementAPI;

public class Main{
	
	public static void main(String[] args) throws Exception  {	
	
		Database db = new Database();
		Scanner sc = new Scanner(System.in);
		Admin add = new Admin();
		Login newlogin = new Login();
		Doctor doc = new Doctor();
		UserFunctions usf = new UserFunctions();
		
		
		String url = "jdbc:mysql://localhost:3306/ClinicManagementSysytem" ;
		String username = "root";
		String password = "";
		ClinicManagementAPI obj = new ClinicManagementAPI(url, username, password);
		
		
	while(true) {
			System.out.println("1:Login as ADMIN\n"
							  +"2:Login as USER\n"
							  +"3:Logout"
								);
			int choice1 = sc.nextInt();
			switch(choice1) {
			case 1: 
					
				boolean login= newlogin.verify(obj);
				if(login) {
			
				
					
					System.out.println("1:Add Various Roles\n"
								+"2:Add staff details\n"
							   +"3:Add lab details\n"
							   +"4:Add Pharmacy details"
							    );
					int choice2 = sc.nextInt();
					switch(choice2) {
					case 1:
						doc.adddoctors(obj); 
								continue;
								
								
					case 2:
						int roleId=add.addStaff(obj);
						if(roleId==2) {
							doc.adddoctors(obj);
						}
						
						continue;
				   
					case 3:
						add.addLab(db);

							continue;
				   
					case 4:
						add.addpharmacydetails(db);
						
						continue;
				
				
				
				
					}
				}
				else {
					break;
				}
				   
			case 2:
				System.out.println("1:Create Account\n"
							+"2:Login "
					);
				int choice3 = sc.nextInt();
				switch(choice3) {
				case 1:
					boolean newuser= newlogin.newUser(obj);
					if(newuser) {
						System.out.println("welcome");
						System.out.println("1:Add Doctor Details\n"
								+"2:add pateint details"
							    );
						int choice4 = sc.nextInt();
						switch(choice4) {
						
						case 1:
							usf.seeDoctoretails(db);
						}
					}
					else {
						System.out.println("wrong staffId");
					}
					continue;
					
				case 2:
					boolean userlogin = newlogin.verify(obj);
					if(userlogin) {
						System.out.println("Welcome");
						
						int choice2 = sc.nextInt();
						switch(choice2) {
						}
			
					}
		
				}
			}
		}	
	}
}



