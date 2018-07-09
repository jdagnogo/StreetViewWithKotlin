package com.example.jdagnogo.streetviewwithkotlin.di

import android.app.Application
import android.arch.persistence.room.Room
import com.example.jdagnogo.streetviewwithkotlin.db.DbFile
import com.example.jdagnogo.streetviewwithkotlin.db.dao.AddressDao
import com.example.jdagnogo.streetviewwithkotlin.db.dao.PlaceDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

const val DB_NAME: String = "streetview_db_v1"

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideDb(app: Application): DbFile {
        return Room
                .databaseBuilder(app, DbFile::class.java, DB_NAME)
                .fallbackToDestructiveMigration()
                .build()
    }

    @Singleton
    @Provides
    fun providePlaceDao(db: DbFile): PlaceDao {
        return db.getPlaceDao()
    }

    @Singleton
    @Provides
    fun provideAddressDao(db: DbFile): AddressDao {
        return db.getAddressDao()
    }

}