package com.endava.qa.gmail.steps;

import com.endava.qa.gmail.hook.LoginTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;

//import static com.endava.qa.gmail.hook.LoginTest.loginTest;

public class MyStepdefs {
    @Given("user open the gmail home")
    public void userOpenTheGmailHome() {
        LoginTest.setUp();
    }
    @SneakyThrows
    @And("user input the username and password")
    public void UserInputs(){
       LoginTest.loginTest();
    }

    @SneakyThrows
    @When("user sing out")
    public void userTapOnSingOut() {
        LoginTest.logoutTest();
    }


}
