/* 
 * @(#)SeleniumController.java    Created on 2013-8-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * @author Robin
 */
public class SeleniumController {

    private static final String openUrl = "http://192.168.1.41";
    private static final String chromeDriveLocation = "src/main/resources/chromedriver.exe";
    private static final String ieDriveLocation = "src/main/resources/IEDriverServer.exe";
    private static final String username = "liuhan";
    private static final String password = "1";

    private WebDriver webDriver;
    private Selenium selenium;

    public SeleniumController() {
        selenium = new DefaultSelenium("192.168.1.41", 4444, "*firefox", "/");
        selenium.start();
    }

    public void firefoxTest() {
        webDriver = new FirefoxDriver();
        run();
    }

    public void chromeTest() throws IOException {
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(SeleniumController.chromeDriveLocation)).usingAnyFreePort().build();
        service.start();
        webDriver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        run();
        webDriver.quit();
        service.stop();
    }

    public void ieTest() throws IOException {
        InternetExplorerDriverService service = new InternetExplorerDriverService.Builder()
                .usingDriverExecutable(new File(SeleniumController.ieDriveLocation)).usingAnyFreePort().build();
        service.start();
        // DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
        // ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        webDriver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.internetExplorer());
        run();
        webDriver.quit();
        service.stop();
    }

    private void run() {
        webDriver.get(openUrl);
        WebElement username = webDriver.findElement(By.xpath("//form/input[@name='username']"));
        username.clear();
        username.sendKeys(SeleniumController.username);
        WebElement password = webDriver.findElement(By.xpath("//form/input[@name='password']"));
        password.clear();
        password.sendKeys(SeleniumController.password);
        WebElement loginBtn = webDriver.findElement(By.xpath("//form/button[@type='submit']"));
        loginBtn.click();

        this.back();
        this.forward();

        WebElement logout = webDriver.findElement(By.xpath("//ul/li[@class='global-top-item']/a"));
        logout.click();
    }

    private void back() {
        webDriver.navigate().back();
    }

    private void forward() {
        webDriver.navigate().forward();
    }

}
