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

        fun europeCountrys(): List<Countrys> {
            return listOf(
                Countrys("Germany"),
                Countrys("Italy"),
                Countrys("France"),
                Countrys("United Kingdom"),
                Countrys("NertherLand")
            )


        }

        fun africaCountrys(): List<Countrys> {
            return listOf(
                Countrys("South Africa"),
                Countrys("Nigeria"),
                Countrys("Kenya"),
                Countrys("Ghana"),
                Countrys("Ethiopia")
            )

        }

        fun asiaCountrys(): List<Countrys> {
            return listOf(
                Countrys("Japan"),
                Countrys("India"),
                Countrys("Indonesi"),
                Countrys("China"),
                Countrys("Thailand")
            )
        }

        fun northAmericaCountrys(): List<Countrys> {
            return listOf(
                Countrys("United States"),
                Countrys("Mexico"),
                Countrys("Cuba"),
                Countrys("Green Land"))
        }

        fun southAmericaCountrys(): List<Countrys> {
            return listOf(
                Countrys("Brazil"),
                Countrys("Argentina"),
                Countrys("Columbia"),
                Countrys("Peru"),
                Countrys("Chile")
            )
        }

        fun antarcticaCountrys(): List<Countrys> {
            return listOf(
                Countrys("Esperenza Base"),
                Countrys("Villa az Estrellaz"),
                Countrys("General Bernando O'Higging"),
                Countrys("Bellgrano II base"),
                Countrys("Carlini Base")
            )
        }

        fun oceaniaCountrys(): List<Countrys> {
            return listOf(
                Countrys("Australia"),
                Countrys("Newzeland"),
                Countrys("Fiji"),
                Countrys("Samao"),
                Countrys("Federated States"))
        }

    }
}