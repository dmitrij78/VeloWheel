package com.dmitrij78.ua.velowheel.application

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class
    ]
)
interface TestApplicationComponent : ApplicationComponent {

    @Component.Builder
    interface Builder {

        fun build(): TestApplicationComponent

        @BindsInstance
        fun application(app: TestApplication): Builder
    }
}