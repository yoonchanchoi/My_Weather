package com.example.my_weather


import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyWeatherApplication : Application(){

    override fun onCreate() {
        super.onCreate()
    }

}