package com.AddressBookSystem;

public class Person {
	private String firstname;
	private String lastname;
	private String street;
	private String city;
	private String state; 
	private String country;
	private String phone;
	private String zip;
	private String Email;
	private String Address;
	
	public Person()
	{
		
	}
	
	
	public  Person(String firstname, String lastname,String street, String city, String state, String country, String phone, String zip, String Email)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
		this.zip = zip;
		this.Email=Email;
	}
	
	public String getfirstname()
	{
		return firstname;
	}
	
	public void setfirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	public String getlastname()
	{
		return lastname;
	}
	
	public void setlastname(String lastname)
	{
		this.lastname = lastname;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getZip()
	{
		return zip;
	}
	
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	public String getEmail()
	{
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public void setAddress(String Address)
	{
		this.Address = Address;
	}


}
