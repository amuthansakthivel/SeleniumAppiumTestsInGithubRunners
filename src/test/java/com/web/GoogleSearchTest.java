package com.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class GoogleSearchTest {

    @SneakyThrows
    @Test
    public void testGoogleSearchUsingSelenoid() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("enableVNC", false);
        capabilities.setCapability("enableVideo", false);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
        driver.get("https://google.co.in");
    }
}
