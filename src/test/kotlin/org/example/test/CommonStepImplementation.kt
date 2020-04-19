package org.example.test

import com.thoughtworks.gauge.Step
import org.junit.Assert

class CommonStepImplementation : TestBase() {

    @Step("Verify title of the page <title>")
    fun verifyTitle(title : String) {
        Assert.assertEquals(driver?.title, title)
    }

}