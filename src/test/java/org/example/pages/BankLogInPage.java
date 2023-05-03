package org.example.pages;

import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC")
public class BankLogInPage extends PageObject {

    @FindBy(name="username")
    private WebElementFacade usernameField;

    @FindBy(name="password")
    private WebElementFacade passwordField;

    @FindBy(how = How.CSS, using = "[type='submit'][value='Log In']")
    private WebElementFacade logInButton;

    public void enter_username(String username) {
        usernameField.type(username);
    }

    public void enter_password(String password) {
        passwordField.type(password);
    }

    public void press_login() {
        logInButton.click();
    }
}