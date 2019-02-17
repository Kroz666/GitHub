package Logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.io.File;

public class LitecartLoginIE {
    public static WebDriver driver;

    public void LitecartLogin() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "C:\\Webdrivers\\IEDriverServer.exe");
        InternetExplorerDriverService service = new InternetExplorerDriverService.Builder()
                .withLogLevel(InternetExplorerDriverLogLevel.TRACE)
                .withLogFile(new File("iedriver.log")).build();
        driver = new InternetExplorerDriver(service, new  InternetExplorerOptions());
        driver.manage().window().maximize();
        driver.get(" http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

}
