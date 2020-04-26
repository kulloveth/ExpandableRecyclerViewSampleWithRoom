package com.developer.kulloveth.expandablelistsamplewithroom.data.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.developer.kulloveth.expandablelistsamplewithroom.data.db.PlaceDatabase
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continents
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Repository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: Repository

    val continents: LiveData<List<Continents>>


    init {
        val continentDao = PlaceDatabase.getDatabase(application).continentDao()
        repository = Repository(continentDao)
        continents = repository.allContinents
    }
}