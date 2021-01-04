package com.dmitrij78.ua.velowheel.ui.activity

import com.dmitrij78.ua.velowheel.di.FragmentScope
import com.dmitrij78.ua.velowheel.ui.fragments.SplashFragment
import com.dmitrij78.ua.velowheel.ui.fragments.SplashFragmentModule
import com.dmitrij78.ua.velowheel.view_model.ViewModelModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
    includes = [
        ViewModelModule::class,
    ]
)
abstract class HomeActivityModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [SplashFragmentModule::class])
    abstract fun contributeSplashFragmentInjector(): SplashFragment
}