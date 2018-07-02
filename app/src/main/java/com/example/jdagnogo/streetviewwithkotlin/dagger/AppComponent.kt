package com.example.jdagnogo.streetviewwithkotlin.dagger

import android.app.Application
import com.example.jdagnogo.streetviewwithkotlin.db.DbFile
import com.example.jdagnogo.streetviewwithkotlin.db.dao.AddressDao
import com.example.jdagnogo.streetviewwithkotlin.db.dao.PlaceDao
import com.example.jdagnogo.streetviewwithkotlin.ui.PanoramaActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(dependencies = arrayOf(), modules = arrayOf( AppModule :: class, RoomModule :: class ))
interface AppComponent {

    fun inject(panoramaActivity: PanoramaActivity)

    fun placeDao(): PlaceDao

    fun addressDao(): AddressDao

    fun dbFile(): DbFile

    fun application(): Application

}