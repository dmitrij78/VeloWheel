package com.dmitrij78.ua.velowheel.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.dmitrij78.ua.velowheel.R
import com.dmitrij78.ua.velowheel.di.Injector
import com.dmitrij78.ua.velowheel.ui.fragments.SplashFragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class HomeActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject lateinit var injector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                add(R.id.fragmentContainer, SplashFragment.newInstance())
            }
        }
    }

    override fun androidInjector(): AndroidInjector<Any> = injector
}