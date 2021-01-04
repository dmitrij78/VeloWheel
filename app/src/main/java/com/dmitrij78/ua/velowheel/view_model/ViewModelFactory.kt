package com.dmitrij78.ua.velowheel.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Provider

class ViewModelFactory constructor(
    private val models: Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val provider: Provider<ViewModel> = models[modelClass]
            ?: throw IllegalArgumentException("Model of class ${modelClass.simpleName} not found")
        @Suppress("UNCHECKED_CAST")
        return provider.get() as T
    }
}