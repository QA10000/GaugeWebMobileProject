package org.example.test

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.example.util.Driver
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait

open class TestBase {

     val driver: AppiumDriver<MobileElement>? = Driver.driver // whar we did here we create an object of Driver and assigned to import from Driver class
     var appUrl = System.getenv("app_url")

    fun waitForPageLoad(driver: WebDriver?) {
        val pageLoadCondition: ExpectedCondition<Boolean> =
            ExpectedCondition { driver -> (driver as JavascriptExecutor?)!!.executeScript("return document.readyState") == "complete" }
        val wait = WebDriverWait(driver, 30)
        wait.until(pageLoadCondition)
    }

}