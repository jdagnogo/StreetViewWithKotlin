package com.example.jdagnogo.streetviewwithkotlin.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.jdagnogo.streetviewwithkotlin.db.dao.AddressDao
import com.example.jdagnogo.streetviewwithkotlin.db.dao.PlaceDao
import com.example.jdagnogo.streetviewwithkotlin.db.entities.AddressEntity
import com.example.jdagnogo.streetviewwithkotlin.db.entities.PlaceEntity

@Database(entities = arrayOf(
        PlaceEntity::class,
        AddressEntity::class), version = 1)

abstract class DbFile : RoomDatabase() {
     abstract fun getPlaceDao() : PlaceDao

    abstract fun getAddressDao(): AddressDao
}