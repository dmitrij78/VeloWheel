package com.dmitrij78.ua.velowheel.base

import com.dmitrij78.ua.velowheel.application.ApplicationComponent
import com.dmitrij78.ua.velowheel.application.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class
    ]
)
interface TestApplicationComponent : ApplicationComponent 