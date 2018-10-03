package com.lesniak.api.network

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [RetrofitModule::class])
class NetworkModule(private val apiKey: String, private val baseUrl: String) {

    @Provides
    @Singleton
    @ApiKey
    fun apiKey() = apiKey

    @Provides
    @Singleton
    @BaseUrl
    fun baseUrl() = baseUrl
}