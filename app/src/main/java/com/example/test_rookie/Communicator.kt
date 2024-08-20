package com.example.test_rookie

import androidx.fragment.app.Fragment

fun Fragment.communicator() : Communicator {
    return requireActivity() as Communicator
}

interface Communicator {
    fun setMainFragment()
}