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

        fun europeCountrys(): List<Country> {
            return listOf(
                Country("Germany"),
                Country("Italy"),
                Country("France"),
                Country("United Kingdom"),
                Country("NertherLand")
            )
        }

        fun africaCountrys(): List<Country> {
            return listOf(
                Country("South Africa"),
                Country("Nigeria"),
                Country("Kenya"),
                Country("Ghana"),
                Country("Ethiopia")
            )

        }

        fun asiaCountrys(): List<Country> {
            return listOf(
                Country("Japan"),
                Country("India"),
                Country("Indonesi"),
                Country("China"),
                Country("Thailand")
            )
        }

        fun northAmericaCountrys(): List<Country> {
            return listOf(
                Country("United States"),
                Country("Mexico"),
                Country("Cuba"),
                Country("Green Land")
            )
        }


        fun southAmericaCountrys(): List<Country> {
            return listOf(
                Country("Brazil"),
                Country("Argentina"),
                Country("Columbia"),
                Country("Peru"),
                Country("Chile")
            )
        }


        fun antarcticaCountrys(): List<Country> {
            return listOf(
                Country("Esperenza Base"),
                Country("Villa az Estrellaz"),
                Country("General Bernando O'Higging"),
                Country("Bellgrano II base"),
                Country("Carlini Base")
            )
        }

        fun oceaniaCountrys(): List<Country> {
            return listOf(
                Country("Australia"),
                Country("Newzeland"),
                Country("Fiji"),
                Country("Samao"),
                Country("Federated States")
            )


        }
    }
}