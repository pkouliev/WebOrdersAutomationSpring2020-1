package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.security.auth.login.Configuration;

public class LoginPage extends BasePage {


    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userNameElement;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement passwordElement;

    public void login(String userName, String password){
        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(password, Keys.ENTER);
    }

    public void login(){
        String username=ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password,Keys.ENTER);


}}




