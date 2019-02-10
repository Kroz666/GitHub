import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class LitecartLoginIE {
    public static WebDriver driver;

    public void LitecartLogin() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "C:\\Webdrivers\\IEDriverServer.exe");
        InternetExplorerOptions options = new InternetExplorerOptions().requireWindowFocus();

        driver = new InternetExplorerDriver(options);
        driver.manage().window().maximize();
        driver.get(" http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

}
