package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Country(val countryName: String) : Parcelable