package com.AddressBookSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
	public static ArrayList<Person> personList = new ArrayList<Person>();
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

public void deleteExistingContact(){
    System.out.println("Enter the name of the person whose details you "
            + "want to delete");
    Scanner sc = new Scanner(System.in);
    String search_pers = sc.next();
    int index = searchExistingContact(search_pers);
    if(index != -1)
    {
	    System.out.println("Person Name is found");
	    Person p = personList.remove(index);
	    System.out.println(p.getfirstname()+" is deleted successfully.");
    }
    else
    {
    	System.out.println(" Person not found ");
    }
}


	public static void main(String[] args) {
		AddressBookSystem obj = new AddressBookSystem();
		char ch='y'; 
		int i = 1;
		do
		{
			System.out.println("Enter your choice ");
			System.out.println("1. Add Contact \n2. Edit contact \n3. Display contacts \n4. Delete contact \n5. Exit");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				do
				{
					Person per=obj.createcontact();
					personList.add(per);
					System.out.println("Do you want to add another person if yes press y otherwise press any key");
					ch=sc.next().charAt(0);
				}while(ch=='y' || ch=='Y');
				
				break;
			case 2:
				obj.editExistingContact();
				break;
			case 3:
				obj.displayPersonDetails();
				break;
			case 4:
				obj.deleteExistingContact();
				break;
			case 5:
				System.exit(0);
				System.out.println("End of the program");
				break;
			default:
				System.out.println("You entered wrong choice");
			}
		
		}while(i==1);
	}
}
