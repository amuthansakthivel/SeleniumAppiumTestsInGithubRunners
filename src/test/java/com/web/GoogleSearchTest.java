package com.web;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class GoogleSearchTest {

    @SneakyThrows
    @Test
    public void testGoogleSearch() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
    }
}
