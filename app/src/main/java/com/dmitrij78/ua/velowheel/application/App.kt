package com.dmitrij78.ua.velowheel.application

import android.app.Application

open class App : Application() {

    protected lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        component = initComponent()
        component.inject(this)
    }

    protected open fun initComponent(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}