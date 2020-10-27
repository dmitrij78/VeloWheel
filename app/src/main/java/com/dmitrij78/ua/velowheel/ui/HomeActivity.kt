package com.dmitrij78.ua.velowheel.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dmitrij78.ua.velowheel.R
import dagger.android.AndroidInjection

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}