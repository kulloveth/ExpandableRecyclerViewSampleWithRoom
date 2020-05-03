package com.developer.kulloveth.expandablelistsamplewithroom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.developer.kulloveth.expandablelistsamplewithroom.R
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel
    val continents = ArrayList<Continent>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        viewModel.continents.observe(this, Observer {

            for (continentEntity: ContinentEntity in it) {

                val continent = Continent(continentEntity.continentName, continentEntity.countrys)
                continents.add(continent)

            }
            val adapter = ContinentAdapter(continents)
            rvConinent.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                rvConinent.adapter = adapter
            }

        })


    }
}
