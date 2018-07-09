package com.example.jdagnogo.streetviewwithkotlin.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.jdagnogo.streetviewwithkotlin.base.ViewModelFactory
import com.example.jdagnogo.streetviewwithkotlin.db.repositoies.AddressRepository
import com.example.jdagnogo.streetviewwithkotlin.viewmodel.AddressViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AddressRepository::class)
    abstract fun bindUserViewModel(addressViewModel: AddressViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}