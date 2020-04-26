package com.developer.kulloveth.expandablelistsamplewithroom.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continents
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Countrys


@Dao
interface CountryDao {
    @Query("SELECT * from `county-table` ORDER BY country ASC")
    fun getAlphabetizedWords(): LiveData<List<Countrys>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(country: Countrys)
}