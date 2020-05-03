package com.developer.kulloveth.expandablelistsamplewithroom.data

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.developer.kulloveth.expandablelistsamplewithroom.R
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continent
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Country
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder


class CountryViewHolder(itemView: View) : ChildViewHolder(itemView) {
    val countryName = itemView.findViewById<TextView>(R.id.countryName)

    fun bind(country: Country) {
        countryName.text = country.countryName
    }
}

class ContinentViewHolder(itemView: View) : GroupViewHolder(itemView) {
    val continentName = itemView.findViewById<TextView>(R.id.continent)
    val arrow = itemView.findViewById<ImageView>(R.id.arrow)

    fun bind(continent: Continent) {
        continentName.text = continent.continentName
    }

}