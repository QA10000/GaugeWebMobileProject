package org.example.util

import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver


/**
 * Project Name : MaxSoft WebBot
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 13/03/2019
 * Time         : 10:30 PM
 * Description  :
 */
// Using WebDriver public class
class CustomScreenshotGrabber : ICustomScreenshotGrabber {
    private val driver: WebDriver? = Driver.driver
    // Return a screenshot byte array
    override fun takeScreenshot(): ByteArray {
        return (driver as TakesScreenshot?)!!.getScreenshotAs(OutputType.BYTES)
    }
}