package com.itsnotme.starwars.di

import android.content.Context
import com.itsnotme.starwars.data.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) =
        AppDatabase.getInstance(context)

    @Provides
    @Singleton
    fun provideFavoritePersonDao(database: AppDatabase) =
        database.favoritePersonDao()
}