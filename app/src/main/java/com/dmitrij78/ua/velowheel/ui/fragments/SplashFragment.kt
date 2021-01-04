package com.dmitrij78.ua.velowheel.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.dmitrij78.ua.velowheel.R
import com.dmitrij78.ua.velowheel.base.BaseFragment

class SplashFragment : BaseFragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val splashText = view.findViewById<TextView>(R.id.splashText)

        val splashViewModel = createViewModel<SplashViewModel>()

        splashViewModel.splashText.observe(viewLifecycleOwner, { text ->
            splashText.text = text
        })
    }

    override fun getLayout(): Int = R.layout.fragment_splash
}