package com.developer.kulloveth.expandablelistsamplewithroom.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.developer.kulloveth.expandablelistsamplewithroom.data.DataGenerator
import com.developer.kulloveth.expandablelistsamplewithroom.data.model.ContinentEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [ContinentEntity::class], version = 1, exportSchema = false)

abstract class ContinentDatabase : RoomDatabase() {

    abstract fun continentDao(): ContinentDao


    companion object {
        @Volatile
        private var INSTANCE: ContinentDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): ContinentDatabase {

            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context, scope).also {
                    INSTANCE = it
                }
            }
        }

        private fun buildDatabase(context: Context, scope: CoroutineScope): ContinentDatabase {
            return Room.databaseBuilder(context, ContinentDatabase::class.java, "place_db")
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