package com.itsnotme.catwiki.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.itsnotme.catwiki.data.fact.cache.FavoriteFactEntity

@Database(entities = [FavoriteFactEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteFactDao(): FavoriteFactDao

    companion object {
        private const val DATABASE_NAME = "CatWiki_db"

        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase = instance ?: synchronized(this) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }
}