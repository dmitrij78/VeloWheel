package com.dmitrij78.ua.velowheel.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import dagger.multibindings.Multibinds
import javax.inject.Provider

@Module
abstract class ViewModelModule {

    @Multibinds
    internal abstract fun multiViewModels(): MutableMap<Class<out ViewModel>, ViewModel>

    companion object {

        @Provides
        @JvmSuppressWildcards
        fun provideViewModelFactory(viewModels: Map<Class<out ViewModel>, Provider<ViewModel>>): ViewModelProvider.Factory {
            return ViewModelFactory(viewModels)
        }
    }
}