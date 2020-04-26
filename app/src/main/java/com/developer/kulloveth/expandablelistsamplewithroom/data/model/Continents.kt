package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "continent-table")
data class Continents(@PrimaryKey @ColumnInfo(name = "continent")val ContinentName: String) : Parcelable