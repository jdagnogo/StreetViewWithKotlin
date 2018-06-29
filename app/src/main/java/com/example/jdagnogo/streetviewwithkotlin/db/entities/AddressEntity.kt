package com.example.jdagnogo.streetviewwithkotlin.db.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "address")
data class AddressEntity(@PrimaryKey(autoGenerate = true) var addressId: Long?,
                         var realAddress: String,
                         var longitude: Number,
                         var latitude: Number){

}