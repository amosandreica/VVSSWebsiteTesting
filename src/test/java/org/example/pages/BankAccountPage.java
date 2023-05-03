package org.example.pages;

import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://parabank.parasoft.com/parabank/overview.htm")
public class BankAccountPage extends PageObject {
    @FindBy(how = How.CSS, using = "[class='title']")
    private WebElementFacade title;

    public String get_title() {
        return title.getText();
    }
}