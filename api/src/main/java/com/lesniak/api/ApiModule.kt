package com.lesniak.network.di

import com.lesniak.api.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(includes = [NetworkModule::class])
class ApiModule {

    @Provides
    @ApiScope
    fun apiService(retrofit: Retrofit) =
        retrofit.create(ApiService::class.java)
}