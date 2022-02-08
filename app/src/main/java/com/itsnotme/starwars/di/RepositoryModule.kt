package com.itsnotme.starwars.di

import com.itsnotme.starwars.data.person.cache.PersonCacheDataSource
import com.itsnotme.starwars.data.person.cache.PersonCacheDataSourceImpl
import com.itsnotme.starwars.data.person.cloud.PersonCloudDataSource
import com.itsnotme.starwars.data.person.cloud.PersonCloudDataSourceImpl
import com.itsnotme.starwars.data.person.repository.PersonRepositoryImpl
import com.itsnotme.starwars.domain.repository.PersonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun provideRepository(repository: PersonRepositoryImpl): PersonRepository

    @Singleton
    @Binds
    abstract fun provideCloudDataSource(cloudDataSource: PersonCloudDataSourceImpl): PersonCloudDataSource

    @Singleton
    @Binds
    abstract fun provideCacheDataSource(cacheDataSource: PersonCacheDataSourceImpl): PersonCacheDataSource
}