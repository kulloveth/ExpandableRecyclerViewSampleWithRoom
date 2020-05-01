package com.developer.kulloveth.expandablelistsamplewithroom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.developer.kulloveth.expandablelistsamplewithroom.R
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continent
import com.developer.kulloveth.expandablelistsamplewithroom.data.ui.ContinentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainActivityViewModel
    val continents = ArrayList<Continent>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        rvConinent.layoutManager = LinearLayoutManager(this)

        viewModel.continents.observe(this, Observer {
            // Log.d("countr", " $it")
            for (con: ContinentEntity in it) {

                val continent = Continent(con.continentName, con.countries)
                continents.add(continent)

                Log.d("countr", " $continents")
            }
            val adapter = ContinentAdapter(continents)
            rvConinent.adapter = adapter
        })


    }
}
