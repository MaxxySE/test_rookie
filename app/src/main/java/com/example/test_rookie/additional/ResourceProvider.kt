package com.example.test_rookie.additional

import android.content.Context

object ResourceProvider {
    private lateinit var appContext: Context

    fun init(context: Context) {
        appContext = context.applicationContext
    }

    fun getString(resId: Int): String {
        return appContext.getString(resId)
    }
}