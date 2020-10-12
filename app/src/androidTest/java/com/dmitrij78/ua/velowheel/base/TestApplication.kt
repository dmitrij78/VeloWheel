package com.dmitrij78.ua.velowheel.base

import androidx.test.core.app.ApplicationProvider
import com.dmitrij78.ua.velowheel.application.App
import com.dmitrij78.ua.velowheel.application.ApplicationComponent
import com.dmitrij78.ua.velowheel.application.ApplicationModule

class TestApplication : App() {

    override fun initComponent(): ApplicationComponent {
        return DaggerTestApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    companion object {

        fun getComponent(): TestApplicationComponent {
            val application: TestApplication =
                ApplicationProvider.getApplicationContext() as TestApplication

            return application.component as TestApplicationComponent
        }
    }
}