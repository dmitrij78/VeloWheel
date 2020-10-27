package com.dmitrij78.ua.velowheel.application

import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        ActivityBindingModule::class
    ]
)
interface ApplicationComponent {

    fun inject(application: App)
}