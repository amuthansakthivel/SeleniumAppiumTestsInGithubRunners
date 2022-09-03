package com.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class WebTest {

    @SneakyThrows
    @Test
    public void testGoogleSearchUsingSelenoid() {
        System.out.println("username :" + System.getProperty("username"));
        System.out.println("password :" + System.getProperty("password"));
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
       /* DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);*/
        driver.get("https://google.co.in");
        Assert.assertEquals(driver.getTitle(), "Google");
        Thread.sleep(10000);
        driver.quit();
    }

}
