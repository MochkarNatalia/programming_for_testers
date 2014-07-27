package com.example.tests;

import org.openqa.selenium.By;

public class GroupsMethods extends AddressBookBaseMethods{

	protected void deleteSelectedGroups() {
		driver.findElement(By.name("delete")).click();
	  }

	protected void selectGroups(int beg, int end) {
		for(int i = beg; i <= end; i++)
		{
			driver.findElement(By.xpath("(//input[@name='selected[]'])[" + i + "]")).click();
		}
	  }

	protected void returnToGroupsPage() {
		driver.findElement(By.linkText("group page")).click();
	  }

	protected void submitGroupCreation() {
		driver.findElement(By.name("submit")).click();
	  }

	protected void fillGroupForm(GroupData group) {
		driver.findElement(By.name("group_name")).clear();
	    driver.findElement(By.name("group_name")).sendKeys(group.name);
	    driver.findElement(By.name("group_header")).clear();
	    driver.findElement(By.name("group_header")).sendKeys(group.header);
	    driver.findElement(By.name("group_footer")).clear();
	    driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	  }

	protected void initGroupCreation() {
		driver.findElement(By.name("new")).click();
	  }

	protected void gotoGroupsPage() {
		driver.findElement(By.linkText("groups")).click();
	  }

}
