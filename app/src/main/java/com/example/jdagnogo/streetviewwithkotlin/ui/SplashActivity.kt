package com.example.jdagnogo.streetviewwithkotlin.ui

import android.app.Activity
import android.os.Bundle
import com.example.jdagnogo.streetviewwithkotlin.R
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class SplashActivity : Activity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}
