package TestCases;

import Base.TestBase;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase
{
    HomePage homepage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homepage = new HomePage();
    }

//    @Test
//    public void verifyHomePageTitleTest() {
//        String homePageTitle = homepage.getHomePageTitle();
//        Assert.assertEquals(homePageTitle, "BOOKSHOP");
//    }
    @Test
    public void searchForItem() throws InterruptedException {
        Thread.sleep(5000);
        homepage.Search(prop.getProperty("bookname"));
    }
    @Test
    public void searchItemAndAddToCart() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homepage.Search(prop.getProperty("bookname"));
    }
}
