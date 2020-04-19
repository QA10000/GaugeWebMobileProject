package org.example.page

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class LoginPage(driver: WebDriver?) {

    @FindBy(id = "email") // create a locator for user name
    private val emailTextBox: WebElement? = null // assign locator to a webelement type variable
    @FindBy(id = "passwd")
    private val passwrdTextBox: WebElement? = null
    @FindBy(xpath = "//p[@class='submit']//span[1]")
    private val signInButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun login(username: String, password: String) {
        emailTextBox?.sendKeys(username)
        passwrdTextBox?.sendKeys(password)
        signInButton?.click()
    }

}