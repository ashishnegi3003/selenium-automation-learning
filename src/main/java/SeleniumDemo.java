import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args){
        String title= GoBrowser("https://www.google.com");
        System.out.println(title);
    }
    private static String GoBrowser(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title= driver.getTitle();
        driver.quit();
        return title;


    }
}
