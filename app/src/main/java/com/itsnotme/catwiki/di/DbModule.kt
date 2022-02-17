package com.itsnotme.catwiki.di

import android.content.Context
import com.itsnotme.catwiki.data.db.AppDatabase
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
    fun provideFavoriteFactDao(database: AppDatabase) =
        database.favoriteFactDao()
}