package com.developer.kulloveth.expandablelistsamplewithroom.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.developer.kulloveth.expandablelistsamplewithroom.R
import com.developer.kulloveth.expandablelistsamplewithroom.data.ContinentViewHolder
import com.developer.kulloveth.expandablelistsamplewithroom.data.CountryViewHolder
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continent
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Country
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class ContinentAdapter(groups: List<ExpandableGroup<*>>?) :
    ExpandableRecyclerViewAdapter<ContinentViewHolder, CountryViewHolder>(
        groups
    ) {


    override fun onCreateGroupViewHolder(parent: ViewGroup?, viewType: Int): ContinentViewHolder {
        val itemView =
            LayoutInflater.from(parent?.context).inflate(R.layout.continent_layout, parent, false)
        return ContinentViewHolder(itemView)
    }

    override fun onCreateChildViewHolder(parent: ViewGroup?, viewType: Int): CountryViewHolder {
        val itemView =
            LayoutInflater.from(parent?.context).inflate(R.layout.countrys_layout, parent, false)
        return CountryViewHolder(itemView)
    }

    override fun onBindChildViewHolder(
        holder: CountryViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?,
        childIndex: Int
    ) {
        val country: Country = group?.items?.get(childIndex) as Country
        holder?.bind(country)
    }

    override fun onBindGroupViewHolder(
        holder: ContinentViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?
    ) {
        val continent: Continent = group as Continent
        holder?.bind(continent)
    }
}