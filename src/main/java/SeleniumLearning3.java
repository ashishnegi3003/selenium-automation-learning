import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLearning3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        LoginPracticePage(driver);
        driver.quit();
    }

    private static void LoginPracticePage(WebDriver driver) throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement usernameID = driver.findElement(By.id("username"));
        usernameID.sendKeys("student");
        WebElement PasswordCssSelector = driver.findElement(By.cssSelector("input[name='password']"));
        PasswordCssSelector.sendKeys("Password123");
        WebElement SubmitXpath = driver.findElement(By.xpath("//button[@class='btn']"));
        SubmitXpath.isDisplayed();
        SubmitXpath.click();
        Thread.sleep(3000);
        // 3-second wait was added so the user can observe the process instead of the browser closing immediately.
    }

}

/*
Keys to remember -
    a. Ctrl+J - to get all instances of a word or words
    b. Ctrl+D - to duplicate a line
    c. Ctrl+K - commit
    d. Ctrl+Shift+K - Push
    e. Ctrl+Alt+L - Reformat Code
    f. Ctrl+Alt+Shift+L - Reformat entire File
 */
