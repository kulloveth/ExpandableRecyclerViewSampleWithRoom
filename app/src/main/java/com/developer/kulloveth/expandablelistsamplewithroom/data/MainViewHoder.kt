package com.developer.kulloveth.expandablelistsamplewithroom.data

import android.view.View
import android.view.animation.Animation.RELATIVE_TO_SELF
import android.view.animation.RotateAnimation
import android.widget.ImageView
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
    val arrow = itemView.findViewById<ImageView>(R.id.arrow)

    fun bind(continent: Continents) {
        continentName.text = continent.continentName
    }

    override fun expand() {
        animateExpand()
    }

    override fun collapse() {
        animateCollapse()
    }

    private fun animateExpand() {
        val rotate = RotateAnimation(
            360f,
            180f,
            RELATIVE_TO_SELF,
            0.5f,
            RELATIVE_TO_SELF,
            0.5f
        )
        rotate.duration = 300
        rotate.fillAfter = true
        arrow.animation = rotate
    }

    private fun animateCollapse() {
        val rotate = RotateAnimation(
            180f,
            360f,
            RELATIVE_TO_SELF,
            0.5f,
            RELATIVE_TO_SELF,
            0.5f
        )
        rotate.duration = 300
        rotate.fillAfter = true
        arrow.animation = rotate
    }

}