package com.itsnotme.starwars.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.itsnotme.starwars.data.person.cache.FavoritePersonEntity

@Dao
interface FavoritePersonDao {
    @Query("DELETE FROM FAVORITE_TABLE")
    suspend fun clearTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(item: FavoritePersonEntity)

    @Query("SELECT * FROM FAVORITE_TABLE")
    fun observeAllFavorites(): LiveData<List<FavoritePersonEntity>>

    @Query("SELECT * FROM FAVORITE_TABLE WHERE url = :url")
    fun observeFavoritePersonByUrl(url: String): LiveData<FavoritePersonEntity>
}