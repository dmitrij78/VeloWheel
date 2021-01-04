package com.dmitrij78.ua.velowheel.ui.fragments

import androidx.lifecycle.ViewModel
import com.dmitrij78.ua.velowheel.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SplashFragmentModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindSplashViewModel(viewModel: SplashViewModel): ViewModel
}