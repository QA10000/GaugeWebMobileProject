package org.example.page

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class HomePage(driver: WebDriver?) {

    @FindBy(xpath = "//a[@class='login']")
    private val signInButton: WebElement? = null // we have to initalize web element as null in kotlin

    init {
        PageFactory.initElements(driver, this) // here we are creating a constructor
    }

    fun clickOnSignOnButton() {
        signInButton?.click()
    }

}