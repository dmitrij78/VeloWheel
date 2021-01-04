package com.dmitrij78.ua.velowheel.application

import dagger.BindsInstance
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

    @Component.Builder
    interface Builder {

        fun build(): ApplicationComponent

        @BindsInstance
        fun application(app: App): Builder
    }
}