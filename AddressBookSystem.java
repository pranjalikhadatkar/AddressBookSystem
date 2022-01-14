package com.AddressBookSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
	ArrayList<Person> personList = new ArrayList<Person>();
	public void displayPersonDetails()
	{
		for(Person p : personList)
		{
			System.out.println("First Name: "+p.getfirstname());
			System.out.println("Last Name: "+p.getlastname());
			System.out.println("Address: "+p.getStreet());
			System.out.println("City: "+p.getCity());
			System.out.println("State: "+p.getState());
			System.out.println("Country: "+p.getCountry());
			System.out.println("Zip Code: "+p.getZip());
			System.out.println("Phone Number: "+p.getPhone());
			System.out.println("Email: "+p.getEmail());
			System.out.println("");
		}
	}
	
public void setPersonDetails() 
{

	Person person1 = new Person("Pranjali", "khadatkar", "besa", "Nagpur", "Maharastra", "India", "8421078744","440034", "pranjalikhadatkar@gmail.com");
	personList.add(person1);
	Person person2 = new Person("pranay", "khadatkar", "besa", "Nagpur", "Maharastra", "India", "9012197036","440027", "khadatkarpranay@gmail.com");
	personList.add(person2);
	Person person3 = new Person("vishal", "pothare", "Pimpalgaon", "Hinganghat", "Maharastra", "India", "9637416031","442301", "potharevishal@gmail.com");
	personList.add(person3);
	Person person4 = new Person("kajal", "palange", "wardha", "wardha", "Maharastra", "India", "9430254160","440021", "kajalpalange@gmail.com");
	personList.add(person4);
}
public Person createcontact() {
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
	person.setStreet(Address);

	
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
	
	return person;
	
}

public int searchExistingContact(String search_pers)
{
    int indx = -1;
    int temp_indx = -1;
    
    for(Person p : personList)
    {
    	temp_indx++;
    	String name = p.getfirstname();
    	if(search_pers.equalsIgnoreCase(name))
    	{
    		indx = temp_indx;
    		break;
    	}
    }
    return indx;
}

public void editExistingContact(){
    System.out.println("Enter the name of the person whose details you "
            + "want to be changed");
    Scanner sc = new Scanner(System.in);
    String search_pers = sc.next();
    int index = searchExistingContact(search_pers);
    if(index != -1 )
    {
	    System.out.println("Found the name, Kindly enter new details ");
	    // Ask for the new details
	    Person p = createcontact();
	    personList.set(index, p);
    }
    else
    {
    	System.out.println("Person not found.");
    }
}

	public static void main(String[] args) {
		AddressBookSystem obj = new AddressBookSystem();
		obj.setPersonDetails();
		obj.editExistingContact();
		obj.displayPersonDetails();

	}

}


