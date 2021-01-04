package com.dmitrij78.ua.velowheel.application

import androidx.test.core.app.ApplicationProvider

class TestApplication : App() {

    override fun initComponent(): ApplicationComponent {
        return DaggerTestApplicationComponent.builder()
            .application(this)
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