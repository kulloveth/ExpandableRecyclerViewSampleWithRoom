package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup


data class Continent(
    val continentName: String, val countries: List<Country>
):  ExpandableGroup<Country>(continentName, countries)