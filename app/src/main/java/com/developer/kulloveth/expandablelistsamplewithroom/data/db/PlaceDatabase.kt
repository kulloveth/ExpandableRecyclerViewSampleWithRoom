package com.developer.kulloveth.expandablelistsamplewithroom.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.sqlite.db.SupportSQLiteDatabase
import com.developer.kulloveth.expandablelistsamplewithroom.data.DataGenerator
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentConverter
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Continents
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.Countrys
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.util.concurrent.Executors

@Database(entities = [ContinentEntity::class], version = 1, exportSchema = false)

 abstract class PlaceDatabase : RoomDatabase() {

    abstract fun continentDao(): ContinentDao


    companion object {
        @Volatile
        private var INSTANCE: PlaceDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): PlaceDatabase {

            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context, scope).also {
                    INSTANCE = it
                }
            }
        }

        private fun buildDatabase(context: Context, scope: CoroutineScope): PlaceDatabase {
            return Room.databaseBuilder(context, PlaceDatabase::class.java, "place_db")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)

                        scope.launch {
                            INSTANCE?.let {
                                for (continent: ContinentEntity in DataGenerator.getContinents()) {
                                    it.continentDao().insert(
                                        ContinentEntity(
                                            continent.continentName,
                                            continent.countrys
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