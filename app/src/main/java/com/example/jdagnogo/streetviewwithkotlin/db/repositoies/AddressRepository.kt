package com.example.jdagnogo.streetviewwithkotlin.db.repositoies

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.jdagnogo.streetviewwithkotlin.db.dao.AddressDao
import com.example.jdagnogo.streetviewwithkotlin.model.Address
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AddressRepository @Inject constructor(

        private val addressDao: AddressDao

): ViewModel()