package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "continent-table")
data class Continents(
    @PrimaryKey @ColumnInfo(name = "continent") val ContinentName: String,
    @ColumnInfo(name = "countrys__layout") val countrys: List<Countrys>
) : ExpandableGroup<Countrys>(ContinentName, countrys)