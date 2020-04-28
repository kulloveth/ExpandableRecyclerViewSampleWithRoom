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
            val coun = ArrayList<Country>()
                coun.add(Country("Germany"))
                coun.add(Country("Italy"))
                coun.add(Country("France"))
                coun.add(Country("United Kingdom"))
                coun.add(Country("NertherLand"))
            return coun


        }

        fun africaCountrys(): ArrayList<Country> {
            val coun = ArrayList<Country>()
            coun.add(Country("South Africa"))
            coun.add(Country("Nigeria"))
            coun.add(Country("Kenya"))
            coun.add(Country("Ghana"))
            coun.add(Country("Ethiopia"))
            return coun
        }

        fun asiaCountrys(): ArrayList<Country> {
            val coun = ArrayList<Country>()
            coun.add(Country("Japan"))
            coun.add(Country("India"))
            coun.add(Country("Indonesi"))
            coun.add(Country("China"))
            coun.add(Country("Thailand"))
            return coun
        }

        fun northAmericaCountrys(): ArrayList<Country> {
            val coun = ArrayList<Country>()

            coun.add(Country("United States"))
            coun.add(Country("Mexico"))
            coun.add(Country("Cuba"))
            coun.add(Country("Green Land"))
            return coun


        }

        fun southAmericaCountrys(): ArrayList<Country> {
            val coun = ArrayList<Country>()
            coun.add(Country("Brazil"))
            coun.add(Country("Argentina"))
            coun.add(Country("Columbia"))
            coun.add(Country("Peru"))
            coun.add(Country("Chile"))

            return coun


        }

        fun antarcticaCountrys(): ArrayList<Country> {
            val coun = ArrayList<Country>()
            coun.add(Country("Esperenza Base"))
            coun.add(Country("Villa az Estrellaz"))
            coun.add(Country("General Bernando O'Higging"))
            coun.add(Country("Bellgrano II base"))
            coun.add(Country("Carlini Base"))
            return coun
        }

        fun oceaniaCountrys(): ArrayList<Country> {
            val coun = ArrayList<Country>()
            coun.add(Country("Australia"))
            coun.add(Country("Newzeland"))
            coun.add(Country("Fiji"))
            coun.add(Country("Samao"))
            coun.add(Country("Federated States"))
            return coun
        }

    }
}