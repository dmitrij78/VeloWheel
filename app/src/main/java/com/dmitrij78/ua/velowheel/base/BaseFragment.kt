package com.dmitrij78.ua.velowheel.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dmitrij78.ua.velowheel.di.Injector
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    abstract fun getLayout(): Int

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onAttach(context: Context) {
        Injector.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayout(), container, false)
    }

    inline fun <reified T : ViewModel> createViewModel(): T {
        return ViewModelProvider(this, viewModelFactory)[T::class.java]
    }
}