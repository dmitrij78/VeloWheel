package com.dmitrij78.ua.velowheel.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SplashViewModel @Inject constructor() : ViewModel() {

    val splashText = MutableLiveData("SplashText live")
}