package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.BankAccountPage;
import org.example.pages.BankLogInPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class AfterLogInSteps {
    BankAccountPage bankAccountPage;

    @Step
    public void is_the_account_page() {
        assertThat(bankAccountPage.get_title(), containsString("Accounts Overview"));
    }
}
