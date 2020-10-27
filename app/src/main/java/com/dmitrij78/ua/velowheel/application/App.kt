package com.dmitrij78.ua.velowheel.application

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

open class App : Application(), HasAndroidInjector {

    protected lateinit var component: ApplicationComponent

    @Inject lateinit var injector: DispatchingAndroidInjector<Any>

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

    override fun androidInjector(): AndroidInjector<Any> = injector
}