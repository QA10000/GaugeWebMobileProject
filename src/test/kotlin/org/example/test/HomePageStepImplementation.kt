package org.example.test

import com.thoughtworks.gauge.Step
import org.example.page.HomePage

class HomePageStepImplementation : TestBase() {

    @Step("User clicks signon button on homepage")
    fun clickSignonButton() {
        val homePage = HomePage(driver)
        homePage.clickOnSignOnButton()
        waitForPageLoad(driver)
    }
}