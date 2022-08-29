package testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class RegisterPage extends Utility {
    String baseUrl ="https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //* click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));

        // * Verify the text ‘Register’
       String acctualmess = getTextFromElement(By.linkText("Register"));
        String expectedmess = "Register";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //* click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));

        //* Select gender radio button
        clickOnElement(By.xpath("//input[@id='gender-female']"));

        clickOnElement(By.xpath("//input[@id='gender-male']"));

        //* Enter First name
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"sap");

        //* Enter Last name
       sendTextToElement(By.xpath("//input[@id='LastName']"),"der");

        //* Select Day Month and Year
        sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"),"5");

       sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"),"April");


       sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"),"1998");

        //* Enter Email address
       sendTextToElement(By.xpath("//input[@id='Email']"),"test1234@gmail.com");


        //* Enter Password
       sendTextToElement(By.xpath("//input[@id='Password']"),"Test12");

        //* Enter Confirm password
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"Test12");


        //* Click on REGISTER button
       clickOnElement(By.xpath("//button[@id='register-button']"));

        //* Verify the text 'Your registration completed’
        String actualText =getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedText="Your registration completed";

        Assert.assertEquals(expectedText,actualText);
    }



    @After
    public void teardown(){
        closeBrowser();

    }
}
