package com.itsnotme.catwiki.di

import com.itsnotme.catwiki.domain.fact.mappers.FactCloudToDomainMapper
import com.itsnotme.catwiki.domain.fact.mappers.FactDbToDomainMapper
import com.itsnotme.catwiki.domain.fact.mappers.FactDomainToDbMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MapperModule {

    @Binds
    @Singleton
    abstract fun provideFactCloudToDomainMapper(mapper: FactCloudToDomainMapper.BaseImpl):
            FactCloudToDomainMapper

    @Binds
    @Singleton
    abstract fun provideFactDbToDomainMapper(mapper: FactDbToDomainMapper.BaseImpl):
            FactDbToDomainMapper

    @Binds
    @Singleton
    abstract fun provideDomainToDbMapper(mapper: FactDomainToDbMapper.BaseImpl):
            FactDomainToDbMapper
}