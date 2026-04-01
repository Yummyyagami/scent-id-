package com.scentid

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ScentIDApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize any app-level setup here
    }
}