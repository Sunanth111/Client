package ClinicManagementSystem;

import java.sql.*;
import java.util.*;
import javaapi.*;

public class Admin{
	Scanner sc = new Scanner(System.in);
	Database db = new Database();
	
	public void addroles(ClinicManagementAPI obj) throws Exception {
		System.out.println("enter the role");
		String roleName = sc.next();
		System.out.println("enter the roleId");
		int roleId = sc.nextInt();
        obj.addroles(roleId,roleName);
	}

	
public int addStaff(ClinicManagementAPI obj ) throws Exception {
	System.out.println("enter the staffID");
	int staffId = sc.nextInt();
	System.out.println("enter the name");
	String name = sc.next();
	
	System.out.println("enter the age");
	int age = sc.nextInt();

	
	System.out.println("enter the gender");
	String gender = sc.next();

	System.out.println("enter the email");
	String email = sc.next();

	System.out.println("enter the address");
	String address = sc.next();

	System.out.println("enter the roleId");
	int roleId = sc.nextInt();

	System.out.println("enter the doj");
	String doj = sc.next();
	
	obj.adddetails(staffId, name, age, gender, email, address, roleId, doj);
	
	return(roleId);
	
	
	
	
}

public void addLab(Database db) throws Exception{
	System.out.println("Enter the Test ID");
	int  testId = sc.nextInt();
	System.out.println("enter the test name");
	String testName = sc.next();
	System.out.println("Enter the test amount");
	int testAmount = sc.nextInt();
	
	db.addlab(testId, testName, testAmount);
	
}
public void addpharmacydetails(Database db) throws Exception{
	System.out.println("Enter the Medicine ID");
	int  MedId = sc.nextInt();
	System.out.println("enter the Medicine name");
	String MedName = sc.next();
	System.out.println("Enter the Medicine amount");
	int MedAmount = sc.nextInt();
	
	db.addpharmacydetails(MedId, MedName, MedAmount);
	
}



}