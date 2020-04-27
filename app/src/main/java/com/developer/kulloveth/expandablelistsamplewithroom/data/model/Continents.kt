package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import android.os.Parcelable
import androidx.room.*
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import kotlinx.android.parcel.Parcelize



data class Continents(
    val continentName: String, val countrys: List<Countrys>
):  ExpandableGroup<Countrys>(continentName, countrys)