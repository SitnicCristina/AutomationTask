package com.endava.qa.gmail.hook;

import com.endava.qa.gmail.actions.LoginLogoutActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.Is.is;


public class LoginTest {
    static LoginLogoutActions loginLogoutActions;
    static WebDriver driver = null;

    @BeforeEach
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\EndavaTask\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,SECONDS);
        driver.get("http://mail.google.com");
        loginLogoutActions = new LoginLogoutActions(driver);
    }

    @Test
    public static void loginTest() throws InterruptedException {
        loginLogoutActions.login("endavaautomationtask@gmail.com","$Test1234");
        assertThat("User email is ", loginLogoutActions.loginConfirmation(), is("endavaautomationtask@gmail.com"));
        Thread.sleep(3000);
    }

    @Test
    public static void logoutTest() throws InterruptedException {
        loginLogoutActions.logout();
        assertThat("Logout successfully ", loginLogoutActions.logoutConfirmation(), is("Alegeți un cont"));
    }

    @AfterEach
    public void tearDown() {
        //driver.quit();
    }

}
