import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//First selenium project to visit a url and get its title
public class SeleniumLearning1 {
    public static void main(String[] args) throws InterruptedException{
        String chromeTitle= chromeTest("https://www.amazon.in/");
        String firefoxTitle= firefoxTest("https://www.flipkart.in/");
        System.out.println("On Chrome :  " + chromeTitle);
        System.out.println("On Firefox :  " + firefoxTitle);
    }
    private static String chromeTest(String url) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(3000);
        String title= driver.getTitle();
        driver.quit();
        return title;
    }
    private static String firefoxTest(String url) throws InterruptedException{
        System.setProperty("webdriverc.gekko.driver","src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        Thread.sleep(3000);
        String title= driver.getTitle();
        driver.quit();
        return title;
    }

}
