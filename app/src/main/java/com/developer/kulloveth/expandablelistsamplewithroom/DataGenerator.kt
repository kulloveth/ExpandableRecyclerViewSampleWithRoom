package com.developer.kulloveth.expandablelistsamplewithroom.data

import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continents
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Countrys
import java.sql.Array

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

        fun europeCountrys(): ArrayList<Countrys> {
            val coun = ArrayList<Countrys>()
                coun.add(Countrys("Germany"))
                coun.add(Countrys("Italy"))
                coun.add(Countrys("France"))
                coun.add(Countrys("United Kingdom"))
                coun.add(Countrys("NertherLand"))
            return coun


        }

        fun africaCountrys(): ArrayList<Countrys> {
            val coun = ArrayList<Countrys>()
            coun.add(Countrys("South Africa"))
            coun.add(Countrys("Nigeria"))
            coun.add(Countrys("Kenya"))
            coun.add(Countrys("Ghana"))
            coun.add(Countrys("Ethiopia"))
            return coun
        }

        fun asiaCountrys(): ArrayList<Countrys> {
            val coun = ArrayList<Countrys>()
            coun.add(Countrys("Japan"))
            coun.add(Countrys("India"))
            coun.add(Countrys("Indonesi"))
            coun.add(Countrys("China"))
            coun.add(Countrys("Thailand"))
            return coun
        }

        fun northAmericaCountrys(): ArrayList<Countrys> {
            val coun = ArrayList<Countrys>()

            coun.add(Countrys("United States"))
            coun.add(Countrys("Mexico"))
            coun.add(Countrys("Cuba"))
            coun.add(Countrys("Green Land"))
            return coun


        }

        fun southAmericaCountrys(): ArrayList<Countrys> {
            val coun = ArrayList<Countrys>()
            coun.add(Countrys("Brazil"))
            coun.add(Countrys("Argentina"))
            coun.add(Countrys("Columbia"))
            coun.add(Countrys("Peru"))
            coun.add(Countrys("Chile"))

            return coun


        }

        fun antarcticaCountrys(): ArrayList<Countrys> {
            val coun = ArrayList<Countrys>()
            coun.add(Countrys("Esperenza Base"))
            coun.add(Countrys("Villa az Estrellaz"))
            coun.add(Countrys("General Bernando O'Higging"))
            coun.add(Countrys("Bellgrano II base"))
            coun.add(Countrys("Carlini Base"))
            return coun
        }

        fun oceaniaCountrys(): ArrayList<Countrys> {
            val coun = ArrayList<Countrys>()
            coun.add(Countrys("Australia"))
            coun.add(Countrys("Newzeland"))
            coun.add(Countrys("Fiji"))
            coun.add(Countrys("Samao"))
            coun.add(Countrys("Federated States"))
            return coun
        }

    }
}