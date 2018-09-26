package com.lesniak.network.di

import dagger.Module
import dagger.Provides

@Module(includes = [RetrofitModule::class])
class NetworkModule(private val apiKey: String, private val baseUrl: String) {

    @Provides
    @NetworkScope
    @ApiKey
    fun apiKey() = apiKey

    @Provides
    @NetworkScope
    @BaseUrl
    fun baseUrl() = baseUrl
}