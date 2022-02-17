package com.itsnotme.catwiki.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.itsnotme.catwiki.data.fact.cache.FavoriteFactEntity

@Dao
interface FavoriteFactDao {
    @Query("DELETE FROM FAVORITE_TABLE")
    suspend fun clearTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(item: FavoriteFactEntity)

    @Query("SELECT * FROM FAVORITE_TABLE")
    fun observeAllFavorites(): LiveData<List<FavoriteFactEntity>>

    @Query("SELECT * FROM FAVORITE_TABLE")
    suspend fun getAllFavorites(): List<FavoriteFactEntity>

    @Query("SELECT * FROM FAVORITE_TABLE WHERE id = :url")
    fun observeFavoriteFactByUrl(url: String): LiveData<FavoriteFactEntity>
}