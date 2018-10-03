package com.lesniak.api.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class GsonModule {

    @Provides
    @Singleton
    fun gson() =
        GsonBuilder().create()

    @Provides
    @Singleton
    fun gsonConverterFactory(gson: Gson) =
        GsonConverterFactory.create(gson)
}