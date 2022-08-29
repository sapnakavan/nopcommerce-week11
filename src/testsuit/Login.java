package testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class Login extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //* click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));


        //* Verify the text ‘Welcome, Please Sign in
        String actualmess1 = getTextFromElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        String expectedmessage = "Welcome, Please Sign In!";

        Assert.assertEquals(expectedmessage, actualmess1);


    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //* click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));

        //* Enter valid username
        sendTextToElement(By.cssSelector("#Email"), "sap@gmail.com");

        //Enter valid password
        sendTextToElement(By.cssSelector("input#Password"), "456789");

        //Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));


        //verify logout word is display
        String acc = getTextFromElement(By.xpath("//a[@class='ico-logout']"));
        String exp = "Log out";
        Assert.assertEquals(exp, acc);


    }

    @Test
    public void verifyTheErrorMessage() {
        //* click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));

        //Enter invalid username
        sendTextToElement(By.xpath("//input[@class='email']"), "sap14@gmail.com");

        //Enter invalid password
        sendTextToElement(By.xpath("//input[@id='Password']"), "1452");

        //Click on Login button
        clickOnElement(By.xpath("//div[@class='returning-wrapper fieldset']/form/div[3]/button"));

        //validtion
        String actualText = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void teardown() {
        closeBrowser();
    }
}
