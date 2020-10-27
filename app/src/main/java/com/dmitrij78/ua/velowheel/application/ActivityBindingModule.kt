package com.dmitrij78.ua.velowheel.application

import android.app.Application
import com.dmitrij78.ua.velowheel.ui.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule(private val application: Application) {

    @ContributesAndroidInjector(modules = [])
    abstract fun contributeActivity(): HomeActivity
}