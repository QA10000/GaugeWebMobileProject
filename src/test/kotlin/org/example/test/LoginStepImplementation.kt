package org.example.test

import com.thoughtworks.gauge.Step
import org.example.page.LoginPage
import org.example.util.Driver.Companion.driver

class LoginStepImplementation : TestBase() {

    @Step("User Login into site using email <email> and password <password>")
    fun userLogin(email : String, password : String){
        waitForPageLoad(driver)
        val login = LoginPage(driver)
        login.login(email, password)
    }

}
