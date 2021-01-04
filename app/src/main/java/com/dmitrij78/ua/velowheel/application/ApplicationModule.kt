package com.dmitrij78.ua.velowheel.application

import android.content.Context
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationModule() {

    @Binds
    abstract fun bindAppContext(app: App): Context
}