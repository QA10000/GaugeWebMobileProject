package org.example.util


import com.thoughtworks.gauge.AfterScenario
import com.thoughtworks.gauge.BeforeScenario
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.util.concurrent.TimeUnit

open class Driver {

   // var driver: AppiumDriver<MobileElement>? = null
    val serverAddress = URL("http://127.0.0.1:4723/wd/hub")
    var browser = System.getenv("browser")
    var platform = System.getenv("platform")
    var platformVersion = System.getenv("platform_version")
    var appUrl = System.getenv("app_url")

    companion object {
        var driver : AppiumDriver<MobileElement>? = null
    }

    @BeforeScenario
    fun createAndroidDriver() : AppiumDriver<MobileElement>? {
        val capabilities = DesiredCapabilities()
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform)
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, platform)
        capabilities.setCapability(MobileCapabilityType.VERSION, platformVersion)
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browser)
        driver = AndroidDriver(serverAddress, capabilities)
        driver?.get(appUrl)
        driver?.let {
            it.manage()?.timeouts()?.implicitlyWait(30, TimeUnit.SECONDS)
        }
        return driver
    }

    @AfterScenario
    fun closeDriver() {
        driver?.quit()
    }
}
