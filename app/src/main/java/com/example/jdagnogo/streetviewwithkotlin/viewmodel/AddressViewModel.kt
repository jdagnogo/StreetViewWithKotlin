package com.example.jdagnogo.streetviewwithkotlin.viewmodel

import android.arch.lifecycle.ViewModel
import com.example.jdagnogo.streetviewwithkotlin.db.repositoies.AddressRepository
import javax.inject.Inject

class AddressViewModel
@Inject constructor(addressRepository: AddressRepository) : ViewModel(){

}