package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    protected  WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return this.wait;
    }
    public void waitToBeClickable(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitToBeVisible(WebElement element){
        getWait().until(ExpectedConditions.visibilityOf(element));
    }


    }









