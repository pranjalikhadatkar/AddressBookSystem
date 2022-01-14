package com.AddressBookSystem;

import java.util.Scanner;

public class AddressBookSystem {
	public static void main(String[] args) {
		System.out.println("Welcome toa Address Book");
		AddressBookSystem createContact = new AddressBookSystem();
		System.out.println("Enter to create contact details in AddressBook ");
		createContact.createContact();
	}
    public void createContact() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter First Name: ");
    	String firstname=sc.nextLine();
    	System.out.println("Enter Last Name: ");
    	String Lastname=sc.nextLine();
    	System.out.println("Enter Street: ");
    	String Street=sc.nextLine();
    	System.out.println("Enter City: ");
    	String City=sc.nextLine();
    	System.out.println("Enter State: ");
    	String State=sc.nextLine();
    	System.out.println("Enter Country: ");
    	String Country=sc.nextLine();
    	System.out.println("Enter Zip Code: ");
    	String ZipCode=sc.nextLine();
    	System.out.println("Enter Phone Number: ");
    	String PhoneNumber=sc.nextLine();
    	System.out.println("Enter Email: ");
    	String Email=sc.nextLine();
    	}
	
}



