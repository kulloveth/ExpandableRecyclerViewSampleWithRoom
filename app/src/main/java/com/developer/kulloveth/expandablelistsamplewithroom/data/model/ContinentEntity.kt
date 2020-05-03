package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import android.os.Parcelable
import androidx.room.*
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

@Entity(tableName = "continent-table")
@TypeConverters(ContinentConverter::class)
data class ContinentEntity (@PrimaryKey @ColumnInfo(name = "continent") val continentName: String,  val countrys: List<Countrys>
)