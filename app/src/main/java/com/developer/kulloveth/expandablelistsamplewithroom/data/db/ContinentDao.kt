package com.developer.kulloveth.expandablelistsamplewithroom.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continents


@Dao
interface ContinentDao {
    @Query("SELECT * from `continent-table` ORDER BY continent ASC")
    fun getAllContinent(): LiveData<List<ContinentEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(continent: ContinentEntity)
}