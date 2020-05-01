package com.developer.kulloveth.expandablelistsamplewithroom.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.developer.kulloveth.expandablelistsamplewithroom.data.db.ContinentDatabase
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Repository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: Repository

    val continents: LiveData<List<ContinentEntity>>


    init {
        val continentDao = ContinentDatabase.getDatabase(application, viewModelScope).continentDao()
        repository = Repository(continentDao)
        continents = repository.allContinents
    }
}