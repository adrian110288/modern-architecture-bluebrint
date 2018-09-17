package com.lesniak.network.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.converter.gson.GsonConverterFactory

@Module
class GsonModule {

    @Provides
    @NetworkScope
    fun gson() =
            GsonBuilder()
                    .create()

    @Provides
    @NetworkScope
    fun gsonConverterFactory(gson: Gson) =
            GsonConverterFactory.create(gson)
}