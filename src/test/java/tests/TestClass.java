package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;

public class TestClass
{
	@Test (description = "verify the test one")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Login test with wrong username and wrong password.")
	@Story("Invalid username and password login test")
	public void TestOne()
	{
		HomePage homePage = new HomePage();
		homePage.clickNextButton();
		homePage.goToLoginPage();
		Assert.assertTrue(1>2);
	}

	@Test (description = "verify the test two")
	public void TestTwo()
	{
		Assert.assertTrue(3 > 2);
	}

	@Test (description = "verify the test three")
	public void TestThree()
	{
		Assert.assertTrue(3 > 2);
	}



}
