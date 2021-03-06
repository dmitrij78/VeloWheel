package com.dmitrij78.ua.velowheel.test

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import com.dmitrij78.ua.velowheel.base.TestApplication

@Suppress("unused")
class AppTestRunner : AndroidJUnitRunner() {

    override fun newApplication(
        cl: ClassLoader?,
        className: String?,
        context: Context?
    ): Application {
        return super.newApplication(cl, TestApplication::class.java.name, context)
    }
}
