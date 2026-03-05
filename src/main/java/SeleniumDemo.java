import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//First selenium project to visit a url and get its title
public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException{
        String browserTitle= chromeTest("https://www.amazon.in/");
        System.out.println("User views :  " + browserTitle);

    }
    private static String chromeTest(String url) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(3000);
        String title= driver.getTitle();
        driver.quit();
        return title;


    }
}
