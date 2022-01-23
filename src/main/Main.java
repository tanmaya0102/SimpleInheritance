package main;

import java.util.Scanner;

public class Main {
	private static Scanner sc;

	/**
	 * 
	 * Main Function
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Donor d1 = new Donor();
		String t;
		System.out.println("Enter the name: ");
		t = sc.nextLine();
		d1.setName(t);
		System.out.println("Enter Date of Birth: ");
		t = sc.nextLine();
		d1.setDateOfBirth(t);
		System.out.println("Enter Gender: ");
		t = sc.nextLine();
		d1.setGender(t);
		System.out.println("Enter Mobile Number: ");
		t = sc.nextLine();
		d1.setMobileNumber(t);
		System.out.println("Enter Blood Group: ");
		t = sc.nextLine();
		d1.setBloodGroup(t);
		System.out.println("Enter Blood Bank Name: ");
		t = sc.nextLine();
		d1.setBloodBankName(t);
		System.out.println("Enter Donor Type: ");
		t = sc.nextLine();
		d1.setDonorType(t);
		System.out.println("Enter Donation Date: ");
		t = sc.nextLine();
		d1.setDonationDate(t);
		
		/**
		 * Display Data
		 */
		d1.displayDonationDetails();
	}

}
