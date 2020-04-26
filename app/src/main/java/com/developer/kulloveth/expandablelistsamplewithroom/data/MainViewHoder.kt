package com.developer.kulloveth.expandablelistsamplewithroom.data

import android.view.View
import android.widget.TextView
import com.developer.kulloveth.expandablelistsamplewithroom.R
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continents
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Countrys
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder


class CountryViewHolder(itemView: View) : ChildViewHolder(itemView) {
    val countryName = itemView.findViewById<TextView>(R.id.countryName)

    fun bind(countrys: Countrys) {
        countryName.text = countrys.countryName
    }
}

class ContinentViewHolder(itemView: View) : GroupViewHolder(itemView) {
    val continentName = itemView.findViewById<TextView>(R.id.continent)

    fun bind(continent: Continents) {
        continentName.text = continent.ContinentName
    }
}