package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.example.steps.serenity.AfterLogInSteps;
import org.example.steps.serenity.LogInSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class LogInStory {

    @Managed(uniqueSession = true, driver="firefox")
    public WebDriver webdriver;

    @Steps
    public LogInSteps user;

    @Steps
    public AfterLogInSteps client;

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
       user.is_the_home_page();
       user.logIn("amos.andreica", "pass");
       client.is_the_account_page();
    }
}