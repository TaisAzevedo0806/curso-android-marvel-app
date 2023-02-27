package com.example.marvelapp.di

import com.example.marvelapp.framework.di.qualifier.BaseUrlQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object BaseUrlTestModule {

    @BaseUrlQualifier
    @Provides
    fun provideBaseUrl(): String = "http://localhost:8080/"
}