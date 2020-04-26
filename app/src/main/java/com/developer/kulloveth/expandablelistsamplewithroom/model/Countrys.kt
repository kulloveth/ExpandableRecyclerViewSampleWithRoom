package com.developer.kulloveth.expandablelistsamplewithroom.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "county-table")
data class Countrys(@PrimaryKey @ColumnInfo(name = "country") val countryName: String) : Parcelable