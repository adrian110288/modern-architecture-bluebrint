package com.lesniak.api.network

import com.lesniak.api.BuildConfig
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [RetrofitModule::class])
class NetworkModule {

    @Provides
    @Singleton
    @ApiKey
    fun apiKey() = BuildConfig.API_KEY
}