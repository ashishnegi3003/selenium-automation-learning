import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class SeleniumLearning2 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        findLoginPageElements(driver);
        findExceptionPageElements(driver);
        driver.quit();
    }
    private static void findLoginPageElements(WebDriver driver){
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
    }

    private static void findExceptionPageElements(WebDriver driver) {
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        // Find WebElement for the "Selenium WebDriver with Java for beginners program" link using link text and partial link text
        WebElement linkByText=driver.findElement(By.linkText("Selenium WebDriver with Java for beginners program"));
        WebElement linkByPartialText=driver.findElement(By.partialLinkText("WebDriver with Java for"));

        // Find WebElements for the input field using tag, class name, XPath, and CSS
        WebElement inputByTagName=driver.findElement(By.tagName("input"));
        WebElement inputByClassName=driver.findElement(By.className("input-field"));
        WebElement inputByXpath=driver.findElement(By.xpath("//input[@class='input-field']"));
        WebElement inputByCss=driver.findElement(By.cssSelector("input.input-field"));

        // Create a list of WebElements for all buttons using tag
        List<WebElement> buttons=driver.findElements(By.tagName("button"));

        // Identify both buttons, using ID, name, CSS, XPath for each
        WebElement button1Id=driver.findElement(By.id("edit_btn"));
        WebElement button1Name=driver.findElement(By.name("Edit"));
        WebElement button1Css=driver.findElement(By.cssSelector("button#edit_btn"));
        WebElement button1Xpath=driver.findElement(By.xpath("//button[@name='Edit']"));

        WebElement button2Id=driver.findElement(By.id("add_btn"));
        WebElement button2Name=driver.findElement(By.name("Add"));
        WebElement button2Css=driver.findElement(By.cssSelector("button#add_btn"));
        WebElement button2Xpath=driver.findElement(By.xpath("//button[@name='Add']"));
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
