package com.example.exampleshopifytestify

import androidx.test.ext.junit.runners.AndroidJUnit4
import dev.testify.ComposableScreenshotRule
import dev.testify.annotation.ScreenshotInstrumentation
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleScreenshotTests {

    @get:Rule
    val rule = ComposableScreenshotRule()

    @ScreenshotInstrumentation
    @Test
    fun greeting() {
        rule.setCompose { Greeting(name = "Android") }.assertSame()
    }
}