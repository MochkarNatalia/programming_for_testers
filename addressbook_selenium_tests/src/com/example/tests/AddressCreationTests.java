package com.example.tests;

import org.testng.annotations.Test;

public class AddressCreationTests extends AddressMethods
{
  
  @Test
  public void testNonEmptyAddressCreation() throws Exception 
  {
    openHomePage();
    initAddressCreation();
    
    AddressDate address = new AddressDate();
	address.firstname = "first name";
	address.lastname = "last name";
	address.address = "address";
	address.home = "home";
	address.mobule = "mobile";
	address.work = "work";
	address.email = "e-mail";
	address.email2 = "e-mail2";
	address.birthdate.day = "1";
	address.birthdate.month = "January";
	address.birthdate.year = "1990";
	address.address2 = "address2";
	address.phone2 = "phone2";
	address.groupname = "Rob";
	
    fillAddressForm(address);
    submitAddressCreation();
    gotoHomePage();
    deleteAddress(1, 1);
    gotoHomePage();
  }
  
  @Test
  public void testEmptyAddressCreation() throws Exception 
  {
    openHomePage();
    initAddressCreation();
    AddressDate address = new AddressDate("", "", "", "", "", "", "", "", "", "", "", "", "", "");
    fillAddressForm(address);
    submitAddressCreation();
    gotoHomePage();
    deleteAddress(1, 1);
    gotoHomePage();
  }

  
}
