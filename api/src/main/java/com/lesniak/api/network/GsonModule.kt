package com.lesniak.api.network

import dagger.Module
import dagger.Provides
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