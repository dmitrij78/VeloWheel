package com.dmitrij78.ua.velowheel.application

import com.dmitrij78.ua.velowheel.di.ActivityScope
import com.dmitrij78.ua.velowheel.ui.activity.HomeActivity
import com.dmitrij78.ua.velowheel.ui.activity.HomeActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    abstract fun contributeHomeActivity(): HomeActivity
}