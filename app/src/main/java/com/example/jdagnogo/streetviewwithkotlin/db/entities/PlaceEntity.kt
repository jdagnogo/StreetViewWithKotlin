package com.example.jdagnogo.streetviewwithkotlin.db.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey

@Entity(foreignKeys = arrayOf(ForeignKey(entity = AddressEntity::class,
        parentColumns = arrayOf("address"),
        childColumns = arrayOf("addressId"),
        onDelete = ForeignKey.CASCADE)))

data class PlaceEntity(val name:String,
                       val address: Number,
                       val description: String,
                       val imageLink: String)

