import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class SeleniumLearning2 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Finding elements using different locators

        WebElement usernameInputField=driver.findElement(By.id("username"));
        WebElement usernameInputFieldXpath=driver.findElement(By.xpath("//input[@id='username']"));
        WebElement usernameInputFieldCss=driver.findElement(By.cssSelector("input[id='username']"));

        WebElement passwordInputField=driver.findElement(By.name("password"));
        WebElement passwordInputFieldXpath=driver.findElement(By.xpath("//input[@name='password']"));
        WebElement passwordInputFieldCss=driver.findElement(By.cssSelector("input[name='password']"));

        WebElement submitButton=driver.findElement(By.className("btn"));
        WebElement submitButtonXpath=driver.findElement(By.xpath("//button[@id='submit']"));
        WebElement submitButtonCss=driver.findElement(By.cssSelector("button[id='submit']"));

        WebElement LinkTextLocator=driver.findElement(By.linkText("Practice Test Automation."));
        WebElement PartialLinkTextLocator=driver.findElement(By.partialLinkText("Test Automation"));

        WebElement passwordRelativeLocator=driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacyLinkRelativeLocator=driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Practice Test Automation")));

        WebElement homeButton=driver.findElement(By.className("menu-item-home"));

        List<WebElement> inputFields = driver.findElements(By.tagName("input"));
        driver.quit();
    }
}

/*
Key Notes-
1. Always Prefer IDs for performance
2. Choose CSS Selectors for simplicity if no IDs
3. Use Xpath with caution - due to its complexity and potential to slow down the test
4. Avoid LinkText, PartialLinkText and Tag Name - unless they are the only options available
5. Keep locators simple and specific for best
*/