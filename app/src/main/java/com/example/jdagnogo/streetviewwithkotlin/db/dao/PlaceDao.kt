package com.example.jdagnogo.streetviewwithkotlin.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.jdagnogo.streetviewwithkotlin.db.entities.PlaceEntity

@Dao
interface PlaceDao {
    /**
     * Load all data
     */
    @Query("SELECT * FROM place")
    fun getAll(): List<PlaceEntity>

    /**
     * insert all data
     */
    @Insert
    fun insertAll(vararg places: PlaceEntity)
}
