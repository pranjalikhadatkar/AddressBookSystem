package com.AddressBookSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
	
ArrayList<Person> personList = new ArrayList<Person>();
	
	public void createcontact() {
		Person person=new Person();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Firstname: ");
		String firstname=sc.nextLine();
		person.setfirstname(firstname);
		
		System.out.println("Enter Lastname: ");
		String lastname=sc.nextLine();
		person.setlastname(lastname);
		
		System.out.println("Enter Address: ");
		String Address=sc.nextLine();
		person.setAddress(Address);
	
		
		System.out.println("Enter City: ");
		String City=sc.nextLine();
		person.setCity(City);
		
		System.out.println("Enter State: ");
		String State=sc.nextLine();
		person.setState(State);
		
		System.out.println("Enter country: ");
		String country=sc.nextLine();
		person.setCountry(country);
		
		System.out.println("Enter Zipcode: ");
		String Zipcode=sc.nextLine();
		person.setZip(Zipcode);
		
		System.out.println("Enter Phonenumber: ");
		String Phonenumber=sc.nextLine();
		person.setPhone(Phonenumber);
		
		System.out.println("Enter Email: ");
		String Email=sc.nextLine();
		person.setEmail(Email);
		
		sc.close();
		personList.add(person);
	}
	
	public void displayPersonDetails()
	{
		for(Person p : personList)
		{
			System.out.println("First Name: "+p.getfirstname());
			System.out.println("Last Name: "+p.getlastname());
			System.out.println("Address: "+p.getAddress());
			System.out.println("City: "+p.getCity());
			System.out.println("State: "+p.getState());
			System.out.println("Country: "+p.getCountry());
			System.out.println("Zip Code: "+p.getZip());
			System.out.println("Phone Number: "+p.getPhone());
			System.out.println("Email: "+p.getEmail());
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		AddressBookSystem obj = new AddressBookSystem();
		int i =1;
		System.out.println("Enter the number of persons whose details you want to add to the address book");
        Scanner sc = new Scanner(System.in);
        int no_of_person = sc.nextInt();
        sc.close();
		do
		{
			System.out.println("Enter person "+ i +" Details");
			obj.createcontact();
			i++;
		}while(i<=no_of_person);
		
		obj.displayPersonDetails();	
	}
}


