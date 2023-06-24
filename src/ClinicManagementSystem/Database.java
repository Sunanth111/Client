package ClinicManagementSystem;

import java.sql.*;


public class Database{
	Connection con ;
	
	public Database() {
		// TODO Auto-generated constructor stub
	
	try {
		String url = "jdbc:mysql://localhost:3306/ClinicManagementSysytem" ;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con = DriverManager.getConnection(url,"root","");

	}catch(Exception e) {
	System.out.println(e);
	}

	}
	
	public void addroles(int roleId, String roleName) throws Exception {
		PreparedStatement preparedStatement = null;
		String query = "insert into roles values(?,?)";
		preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, roleId);
		preparedStatement.setString(2, roleName);
		
		ResultSet rs = preparedStatement.executeQuery();
		if (rs.next())
	        System.out.println(
	            "inserted successfully : " + query);
	    else
	        System.out.println("insertion failed");
	}
	
	public void adddetails(int staffId,String name,int age,String gender,String email,String address,int roleId,String doj) throws Exception {
		PreparedStatement preparedStatement = null;
		String query = "insert into staff values(?,?,?,?,?,?,?,?)";
		preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, staffId);
		preparedStatement.setString(2, name);
		preparedStatement.setInt(3, age);
		preparedStatement.setString(4, gender);
		preparedStatement.setString(5,email);
		preparedStatement.setInt(6,roleId);
		preparedStatement.setString(7,address);
		preparedStatement.setString(8,doj);  
		
		boolean rs = preparedStatement.execute();
		if (rs)
	        System.out.println(
	            "inserted successfully : " + query);
	    else
	        System.out.println("insertion failed");
	}
	
	public boolean Login(String username,String password) throws Exception {
		PreparedStatement preparedStatement = null;
		String query = "Select name from staff where staffid=(select staffId from loginCredentials where username=? and password=?)";
		try {
			//"Select * from loginCredentials where staffId=?";
			preparedStatement  = con.prepareStatement(query);
			 preparedStatement.setString(1,username);
			 preparedStatement.setString(2,password);
			 ResultSet rs = preparedStatement.executeQuery();
			 if(rs.next()) {
				 return true;
			 }
			 else 
				 return false;
		}finally {
			if( preparedStatement!=null) {
				preparedStatement.close();
			}
		}
	}
	
	/*public boolean newlogin(int staffId,String username,String password) throws Exception {
		
	      if(rs.next()) {
				 return true;
			 }
			 else 
				 return false;
		}finally {
			if( preparedStatement!=null) {
				preparedStatement.close();
			}
		}
	}*/
	
	public void addlab(int testId, String testName, int testAmount) throws Exception {
		PreparedStatement preparedStatement = null;
		String query = "insert into labDetails(testId,testName,testAmount)values(?,?,?)";
		preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, testId);
		preparedStatement.setString(2, testName);
		preparedStatement.setInt(3, testAmount);
		
		int rowCount = preparedStatement.executeUpdate();
		if (rowCount == 1)
	        System.out.println(
	            "inserted successfully : " + query);
	    else
	        System.out.println("insertion failed");

		
	}
	public void addpharmacydetails(int medId, String medName, int medAmount) throws Exception {
		PreparedStatement preparedStatement = null;
		String query = "insert into labDetails(testId,testName,testAmount)values(?,?,?)";
		preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, medId);
		preparedStatement.setString(2, medName);
		preparedStatement.setInt(3, medAmount);
		
		int rowCount = preparedStatement.executeUpdate();
		if (rowCount == 1)
	        System.out.println(
	            "inserted successfully : " + query);
	    else
	        System.out.println("insertion failed");

	}
	
	public void adddoctor(int docId, int staffId, String specialization, int experience,int PhoneNumber) throws Exception {
		PreparedStatement preparedstatement = null;
		String query = "insert into doctor(docId,staffId,Specialization,experience)values(?,?,?,?)";
		preparedstatement = con.prepareStatement(query);
		preparedstatement.setInt(1, docId);
		preparedstatement.setInt(2, staffId);
		preparedstatement.setString(3, specialization);
		preparedstatement.setInt(4, experience);
		preparedstatement.setInt(5, PhoneNumber);
		
		int rowCount = preparedstatement.executeUpdate();
		if (rowCount == 1)
	        System.out.println(
	            "inserted successfully : " + query);
	    else
	        System.out.println("insertion failed");
		
		
	}
	public void doctorslist() throws Exception {
		PreparedStatement preparedstatement = null;
		String query = "select * from Doctor";
		preparedstatement = con.prepareStatement(query);
		ResultSet rs = preparedstatement.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+rs.getInt(2));
		}
	}
}
