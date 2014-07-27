package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddressMethods extends AddressBookBaseMethods{

	protected void deleteAddress(int beg, int end) {
		for( int i = beg; i <= end; i++)
		{
			driver.findElement(By.xpath("(//img[@alt='Edit'])[" + i + "]")).click();
			driver.findElement(By.xpath("(//input[@name='update'])[2]")).click();
		}
	  }

	protected void submitAddressCreation() {
		driver.findElement(By.name("submit")).click();
	  }

	protected void fillAddressForm(AddressDate address) {
		driver.findElement(By.name("firstname")).clear();
	    driver.findElement(By.name("firstname")).sendKeys(address.firstname);
	    driver.findElement(By.name("lastname")).clear();
	    driver.findElement(By.name("lastname")).sendKeys(address.lastname);
	    driver.findElement(By.name("address")).clear();
	    driver.findElement(By.name("address")).sendKeys(address.address);
	    driver.findElement(By.name("home")).clear();
	    driver.findElement(By.name("home")).sendKeys(address.home);
	    driver.findElement(By.name("mobile")).clear();
	    driver.findElement(By.name("mobile")).sendKeys(address.mobule);
	    driver.findElement(By.name("work")).clear();
	    driver.findElement(By.name("work")).sendKeys(address.work);
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys(address.email);
	    driver.findElement(By.name("email2")).clear();
	    driver.findElement(By.name("email2")).sendKeys(address.email2);
	    if (address.birthdate.day != "")
	    {
	    	new Select(driver.findElement(By.name("bday"))).selectByVisibleText(address.birthdate.day);
	    }
	    if (address.birthdate.month != "")
	    {
	    	new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(address.birthdate.month);
	    }
	    driver.findElement(By.name("byear")).clear();
	    driver.findElement(By.name("byear")).sendKeys(address.birthdate.year);
	    if (address.groupname != "")
	    {
	    	new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(address.groupname);
	    }
	    driver.findElement(By.name("address2")).clear();
	    driver.findElement(By.name("address2")).sendKeys(address.address2);
	    driver.findElement(By.name("phone2")).clear();
	    driver.findElement(By.name("phone2")).sendKeys(address.phone2);
	  }

	protected void initAddressCreation() {
		driver.findElement(By.linkText("add new")).click();
	  }

}
