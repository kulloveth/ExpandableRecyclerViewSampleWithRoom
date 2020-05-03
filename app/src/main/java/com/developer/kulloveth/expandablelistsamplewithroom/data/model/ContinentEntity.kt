package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity(tableName = "continent-table")
@TypeConverters(ContinentConverter::class)
data class ContinentEntity (@PrimaryKey @ColumnInfo(name = "continent") val continentName: String,  val countrys: List<Country>
)