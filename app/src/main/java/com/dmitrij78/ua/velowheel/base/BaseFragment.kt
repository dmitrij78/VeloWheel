package com.dmitrij78.ua.velowheel.base

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    abstract fun getLayout(): Int
}