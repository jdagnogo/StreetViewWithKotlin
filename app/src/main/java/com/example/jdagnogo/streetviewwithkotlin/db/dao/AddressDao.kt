package com.example.jdagnogo.streetviewwithkotlin.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.jdagnogo.streetviewwithkotlin.db.entities.AddressEntity

@Dao
public interface AddressDao {
    /**
     * Load all data
     */
    @Query("SELECT * FROM address")
    fun getAll(): List<AddressEntity>

    /**
     * insert all data
     */
    @Insert
    fun insertAll(vararg users: AddressEntity)
}