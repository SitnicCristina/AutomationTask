package com.endava.qa.gmail.page;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter

public class LoginLogoutPage {
    WebDriver driver;

    @FindBy(xpath="//*[@id=\"identifierId\"]")
    private WebElement emailField;
    @FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/div[2]")
    private WebElement nextLoginButton;
    @FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement passwordField;
    @FindBy(xpath="//*[@id=\"passwordNext\"]/div/button/div[2]")
    private WebElement nextPasswordButton;
    @FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img")
    private WebElement loginConfirmation;
    @FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[4]/div[1]/div[2]/div[2]")
    private WebElement userEmail;
    @FindBy(xpath="//*[@id=\\\"gb_71\\\"]")
    private WebElement logOutButton;
    @FindBy(xpath="//*[@id=\"headingText\"]/span")
    private WebElement logoutConfirmation;


    public LoginLogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
