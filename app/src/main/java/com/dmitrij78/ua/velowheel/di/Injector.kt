package com.dmitrij78.ua.velowheel.di

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection

object Injector {

    fun inject(activity: AppCompatActivity) {
        AndroidInjection.inject(activity)
    }

    fun inject(fragment: Fragment) {
        AndroidSupportInjection.inject(fragment)
    }
}