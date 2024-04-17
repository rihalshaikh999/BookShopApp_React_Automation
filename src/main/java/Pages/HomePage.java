package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Base.TestBase.driver;

public class HomePage extends TestBase
{
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div[2]/div/div/div/input")
    WebElement searchBar;
//    @FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root')]//span")
    @FindBy(xpath = "/html/body/div/div/div/main/div[4]/div[2]/div/div/div[2]/button") // /html/body/div/div/div/main/div[4]/div[2]/div/div/div[2]/button
                                                            // //*[@id="pro"]/div/div[2]/button
    WebElement addToCartButton;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void Search(String s) {
        searchBar.sendKeys(s);
    }
    public void clickaddtoCart() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
        addToCartButton.click();
    }
}
