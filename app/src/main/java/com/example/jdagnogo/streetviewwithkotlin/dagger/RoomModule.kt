package com.example.jdagnogo.streetviewwithkotlin.dagger

import android.app.Application
import dagger.Provides
import javax.inject.Singleton
import android.arch.persistence.room.Room
import com.example.jdagnogo.streetviewwithkotlin.db.DbFile
import com.example.jdagnogo.streetviewwithkotlin.db.dao.AddressDao
import com.example.jdagnogo.streetviewwithkotlin.db.dao.PlaceDao
import dagger.Module


@Module
class RoomModule(mApplication: Application) {

    private val demoDatabase: DbFile

    init {
        demoDatabase = Room.databaseBuilder(mApplication, DbFile::class.java!!, "streetview_db").build()
    }

    @Singleton
    @Provides
    internal fun providesRoomDatabase(): DbFile {
        return demoDatabase
    }

    @Singleton
    @Provides
    internal fun providesPlaceDao(demoDatabase: DbFile): PlaceDao {
        return demoDatabase.getPlaceDao()
    }

    @Singleton
    @Provides
    internal fun providesAddressDao(demoDatabase: DbFile): AddressDao {
        return demoDatabase.getAddressDao()
    }
}