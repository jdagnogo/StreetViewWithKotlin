package com.example.jdagnogo.streetviewwithkotlin.di

import android.app.Application
import com.example.jdagnogo.streetviewwithkotlin.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
        dependencies = arrayOf(), modules = arrayOf(
        AppModule::class,
        AndroidInjectionModule::class)
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(mainApplication: MainApplication)
}