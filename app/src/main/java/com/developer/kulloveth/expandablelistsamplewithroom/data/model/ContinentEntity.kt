package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import androidx.room.*

@Entity(tableName = "continent-table")
@TypeConverters(ContinentConverter::class)
data class ContinentEntity (@PrimaryKey @ColumnInfo(name = "continent") val continentName: String,  val countries: ArrayList<Country>
)