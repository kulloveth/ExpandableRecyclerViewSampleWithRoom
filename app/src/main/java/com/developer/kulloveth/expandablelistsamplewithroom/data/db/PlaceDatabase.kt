package com.developer.kulloveth.expandablelistsamplewithroom.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.developer.kulloveth.expandablelistsamplewithroom.data.DataGenerator
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import java.util.concurrent.Executors

@Database(entities = arrayOf(ContinentEntity::class), version = 1, exportSchema = false)

public abstract class PlaceDatabase : RoomDatabase() {

    abstract fun continentDao(): ContinentDao


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
                                for (continent: ContinentEntity in DataGenerator.getContinents()) {
                                    it.continentDao().insert(
                                        ContinentEntity(
                                            continent.continentName,
                                            continent.countries
                                        )
                                    )
                                }

                            }
                        }

                    }
                }).build()


        }
    }

}