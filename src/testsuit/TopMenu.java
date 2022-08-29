package testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class TopMenu extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
       clickOnElement(By.linkText("Computers"));


        //Verify the text ‘Computers’
        String actualmess = getTextFromElement(By.linkText("Computers"));
        String expectedmess = "Computers";

        Assert.assertEquals(expectedmess, actualmess);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //* click on the ‘Electronics’ Tab
       clickOnElement(By.linkText("Electronics"));


        //* Verify the text ‘Electronics’
        String actualmess = getTextFromElement(By.linkText("Electronics"));
        String expectedmess = "Electronics";

        Assert.assertEquals(expectedmess, actualmess);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the ‘Apparel’ Tab
        clickOnElement(By.linkText("Apparel"));

        //* Verify the text ‘Apparel’
        String acctualmess = getTextFromElement(By.linkText("Apparel"));
        String expectedmess = "Apparel";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        clickOnElement(By.linkText("Digital downloads"));


        //Verify the text ‘Digital downloads’
        String acctualmess = getTextFromElement(By.linkText("Digital downloads"));
        String expectedmess = "Digital downloads";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘Books’ Tab
      clickOnElement(By.linkText("Books"));

        //Verify the text ‘Books’
        String acctualmess = getTextFromElement(By.linkText("Books"));
        String expectedmess = "Books";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        clickOnElement(By.linkText("Jewelry"));

        //Verify the text ‘jewelry’
        String acctualmess = getTextFromElement(By.linkText("Jewelry"));
        String expectedmess = "Jewelry";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        clickOnElement(By.linkText("Gift Cards"));

        //Verify the text ‘Gift Cards’
       String acctualmess = getTextFromElement(By.linkText("Gift Cards"));
        String expectedmess = "Gift Cards";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @After
    public void teardown() {
        closeBrowser();

    }

}
