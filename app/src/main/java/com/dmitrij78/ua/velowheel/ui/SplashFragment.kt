package com.dmitrij78.ua.velowheel.ui

import com.dmitrij78.ua.velowheel.R
import com.dmitrij78.ua.velowheel.base.BaseFragment

class SplashFragment : BaseFragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    override fun getLayout(): Int = R.layout.fragment_splash
}