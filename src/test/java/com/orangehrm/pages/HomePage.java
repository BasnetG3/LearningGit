package com.orangehrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class HomePage {

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminLink;
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']/descendant::p[@class='oxd-userdropdown-name']")
	WebElement profilePicture;
	@FindBy(linkText = "Logout")
	WebElement logoutLink;

	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	Logger log = LogManager.getLogger(HomePage.class);

	public void clickOnAdminLink() {
		adminLink.click();
		log.info("Admin link is clicked !");
		ExtentReportUtils.addStep("Clicked on Admin link.");
	}

	public void logoutFromApplication() {
		profilePicture.click();
		ExtentReportUtils.addStep("Clicked on Profile Picture image.");
		log.info("Profile picture is clicked !");

		logoutLink.click();
		log.info("Logout link  is clicked !");
		ExtentReportUtils.addStep("Logout link is clicked.");
	}

}
