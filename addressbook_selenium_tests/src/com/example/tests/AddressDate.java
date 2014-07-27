package com.example.tests;

public class AddressDate 
{
	public String firstname;
	public String lastname;
	public String address;
	public String home;
	public String mobule;
	public String work;
	public String email;
	public String email2;
	public Data birthdate = new Data();
	public String groupname;
	public String address2;
	public String phone2;

	public AddressDate(String firstname, String lastname, String address,
			String home, String mobule, String work, String email,
			String email2, String day, String month, String year,
			String groupname, String address2, String phone2) 
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.home = home;
		this.mobule = mobule;
		this.work = work;
		this.email = email;
		this.email2 = email2;
		this.birthdate.day = day;
		this.birthdate.month = month;
		this.birthdate.year = year;
		this.groupname = groupname;
		this.address2 = address2;
		this.phone2 = phone2;
	}
	
	public AddressDate() 
	{}
}