package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import androidx.lifecycle.LiveData
import com.developer.kulloveth.expandablelistsamplewithroom.data.db.ContinentDao

class Repository( continentDao: ContinentDao) {

    val allContinents: LiveData<List<ContinentEntity>> = continentDao.getAllContinent()


}