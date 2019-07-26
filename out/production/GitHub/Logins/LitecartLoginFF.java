package Logins;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.firefox.*;

public class LitecartLoginFF {
    public static WebDriver driver;

    public void LitecartLoginFF() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Webdrivers\\geckodriver.exe");
       /* ProfilesIni profile = new ProfilesIni();
        FirefoxProfile testprofile;
        testprofile = profile.getProfile("allpcyex.default-release");

        FirefoxOptions opt = new FirefoxOptions();
        opt.setProfile(testprofile);*/
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(" http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

}
