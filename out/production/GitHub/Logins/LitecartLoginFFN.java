package Logins;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;

public class LitecartLoginFFN {
    public static WebDriver driver;
    private static Capabilities binary;


    public void LitecartLoginFFN() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "C:\\Webdrivers\\geckodriver.exe");

        FirefoxBinary binary = new FirefoxBinary(
                new File("C:\\Program Files\\Firefox Nightly\\firefox.exe"));

        FirefoxProfile profile = new FirefoxProfile();



        driver = new FirefoxDriver(binary, profile);
        driver.manage().window().maximize();
        driver.get(" http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

}

