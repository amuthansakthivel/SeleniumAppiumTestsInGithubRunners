package com.web;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class WebTest {

    @SneakyThrows
    @Test(groups = "web")
    public void testGoogleSearchUsingSelenoid() {
        System.out.println("username :" + System.getProperty("username"));
        System.out.println("password :" + System.getProperty("password"));

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
        driver.get("https://google.co.in");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }
}
