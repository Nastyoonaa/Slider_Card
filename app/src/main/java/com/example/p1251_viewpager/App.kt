package com.example.p1251_viewpager

import android.app.Application
import android.content.Context

class App : Application() {
    companion object {
        lateinit var ctx: Context
    }

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
    }
}