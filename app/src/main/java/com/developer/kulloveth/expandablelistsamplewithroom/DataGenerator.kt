package com.developer.kulloveth.expandablelistsamplewithroom.data

import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Country

class DataGenerator {

    companion object {
        fun getContinents(): List<ContinentEntity> {
            return listOf(
                ContinentEntity("Europe", europeCountrys()),
                ContinentEntity("Africa", africaCountrys()),
                ContinentEntity("Asia", asiaCountrys()),
                ContinentEntity("North America", northAmericaCountrys()),
                ContinentEntity("South America", southAmericaCountrys()),
                ContinentEntity("Antarctica", antarcticaCountrys()),
                ContinentEntity("Oceania", oceaniaCountrys())
            )
        }

        fun europeCountrys(): ArrayList<Country> {
            val counntries = ArrayList<Country>()
            counntries.add(Country("Germany"))
            counntries.add(Country("Italy"))
            counntries.add(Country("France"))
            counntries.add(Country("United Kingdom"))
            counntries.add(Country("NertherLand"))
            return counntries


        }

        fun africaCountrys(): ArrayList<Country> {
            val counntries = ArrayList<Country>()
            counntries.add(Country("South Africa"))
            counntries.add(Country("Nigeria"))
            counntries.add(Country("Kenya"))
            counntries.add(Country("Ghana"))
            counntries.add(Country("Ethiopia"))
            return counntries
        }

        fun asiaCountrys(): ArrayList<Country> {
            val counntries = ArrayList<Country>()
            counntries.add(Country("Japan"))
            counntries.add(Country("India"))
            counntries.add(Country("Indonesi"))
            counntries.add(Country("China"))
            counntries.add(Country("Thailand"))
            return counntries
        }

        fun northAmericaCountrys(): ArrayList<Country> {
            val counntries = ArrayList<Country>()

            counntries.add(Country("United States"))
            counntries.add(Country("Mexico"))
            counntries.add(Country("Cuba"))
            counntries.add(Country("Green Land"))
            return counntries


        }

        fun southAmericaCountrys(): ArrayList<Country> {
            val counntries = ArrayList<Country>()
            counntries.add(Country("Brazil"))
            counntries.add(Country("Argentina"))
            counntries.add(Country("Columbia"))
            counntries.add(Country("Peru"))
            counntries.add(Country("Chile"))

            return counntries


        }

        fun antarcticaCountrys(): ArrayList<Country> {
            val counntries = ArrayList<Country>()
            counntries.add(Country("Esperenza Base"))
            counntries.add(Country("Villa az Estrellaz"))
            counntries.add(Country("General Bernando O'Higging"))
            counntries.add(Country("Bellgrano II base"))
            counntries.add(Country("Carlini Base"))
            return counntries
        }

        fun oceaniaCountrys(): ArrayList<Country> {
            val counntries = ArrayList<Country>()
            counntries.add(Country("Australia"))
            counntries.add(Country("Newzeland"))
            counntries.add(Country("Fiji"))
            counntries.add(Country("Samao"))
            counntries.add(Country("Federated States"))
            return counntries
        }

    }
}