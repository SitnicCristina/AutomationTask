package com.endava.qa.gmail.actions;

import com.endava.qa.gmail.page.LoginLogoutPage;
import org.openqa.selenium.WebDriver;

public class LoginLogoutActions {
    public LoginLogoutPage loginLogoutPage;

    public LoginLogoutActions(WebDriver driver) {
        loginLogoutPage = new LoginLogoutPage(driver);
    }

    public void login(String email,String password ){
        loginLogoutPage.getEmailField().sendKeys(email);
        loginLogoutPage.getNextLoginButton().click();
        loginLogoutPage.getPasswordField().sendKeys(password);
        loginLogoutPage.getNextPasswordButton().click();
    }

    public void logout(){
        loginLogoutPage.getLogOutButton().click();
    }

    public String loginConfirmation(){
        loginLogoutPage.getLoginConfirmation().click();
        return loginLogoutPage.getUserEmail().getText();
    }

    public String logoutConfirmation(){
        loginLogoutPage.getLogoutConfirmation().click();
        return loginLogoutPage.getLogoutConfirmation().getText();
    }

}
