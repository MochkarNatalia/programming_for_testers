
package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends GroupsMethods
{
  @Test
  public void testNonEmptyGroupCreation() throws Exception 
  {
    openHomePage();
    gotoGroupsPage();
    initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group_name";
    group.header = "header";
    group.footer = "footer";
	fillGroupForm(group);
    submitGroupCreation();
    returnToGroupsPage();
    selectGroups(1, 1);
    deleteSelectedGroups();
    returnToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception 
  {
    openHomePage();
    gotoGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitGroupCreation();
    returnToGroupsPage();
    selectGroups(1, 1);
    deleteSelectedGroups();
    returnToGroupsPage();
  }
 }
