package ClinicManagementSystem;

import java.util.Scanner;

import javaapi.ClinicManagementAPI;



public class Doctor {
	Scanner sc = new Scanner(System.in);
	
	public void adddoctors(ClinicManagementAPI obj) throws Exception {
		System.out.println("enter the doctor Id");
		int docId = sc.nextInt();
		System.out.println("enter the staffId");
		int staffId = sc.nextInt();
		System.out.println("enter the specialization");
		String specialization = sc.next();
		System.out.println("enter the years of experience");
		int experience = sc.nextInt();
		System.out.println("enter the phoneNumber");
		int phoneNumber = sc.nextInt();
		
		obj.createDoctor(docId,staffId,specialization,experience,phoneNumber);
	}
	
	public void seepateintdetails() {
		
	}
}
