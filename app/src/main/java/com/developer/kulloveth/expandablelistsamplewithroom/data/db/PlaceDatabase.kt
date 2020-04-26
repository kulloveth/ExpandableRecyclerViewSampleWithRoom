package com.developer.kulloveth.expandablelistsamplewithroom.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continents
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Countrys
import java.util.concurrent.Executors

@Database(entities = arrayOf(Continents::class), version = 1, exportSchema = false)
public abstract class PlaceDatabase : RoomDatabase() {

    abstract fun continentDao(): ContinentDao
    abstract fun countryDao(): CountryDao
    private var mContext: Context? = null

    companion object {
        @Volatile
        private var INSTANCE: PlaceDatabase? = null

        fun getDatabase(context: Context): PlaceDatabase {

            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also {
                    INSTANCE = it
                }
            }
        }

        private fun buildDatabase(context: Context): PlaceDatabase {
            return Room.databaseBuilder(context, PlaceDatabase::class.java, "place_db")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)

                        Executors.newSingleThreadExecutor().execute {
                            INSTANCE?.let {

                                // it.continentDao().insert()
                            }
                        }

                    }
                }).build()


        }
    }

}