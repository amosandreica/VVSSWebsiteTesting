package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.BankLogInPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class LogInSteps {
    BankLogInPage bankMainPage;

    @Step
    public void is_the_home_page() {
        bankMainPage.open();
    }

    @Step
    public void entersUsername(String keyword) {
        bankMainPage.enter_username(keyword);
    }

    @Step
    public void entersPassword(String keyword) {
        bankMainPage.enter_password(keyword);
    }

    @Step
    public void clickLogin() {
        bankMainPage.press_login();
    }

    @Step
    public void logIn(String username, String password){
        entersUsername(username);
        entersPassword(password);
        clickLogin();
    }

}
