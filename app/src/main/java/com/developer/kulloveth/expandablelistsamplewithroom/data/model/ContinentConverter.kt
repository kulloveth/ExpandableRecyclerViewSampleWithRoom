package com.developer.kulloveth.expandablelistsamplewithroom.data.model

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*


class ContinentConverter {


    companion object {
        var gson: Gson = Gson()
        @TypeConverter @JvmStatic
        fun stringToSomeObjectList(data: String?): ArrayList<Countrys> {
            val listType: Type =
                object : TypeToken<ArrayList<Countrys?>?>() {}.getType()
            return gson.fromJson(data, listType)
        }

        @TypeConverter @JvmStatic
        fun someObjectListToString(someObjects: ArrayList<Countrys?>?): String {
            return gson.toJson(someObjects)
        }
    }
}