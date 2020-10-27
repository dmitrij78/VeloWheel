package com.dmitrij78.ua.velowheel.application

import android.app.Application
import android.content.Context
import com.dmitrij78.ua.velowheel.ui.HomeActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    fun provideApplicationContext(): Context {
        return application
    }
}