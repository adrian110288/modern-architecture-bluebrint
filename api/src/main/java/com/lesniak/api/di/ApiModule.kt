package com.lesniak.api.di

import com.lesniak.api.services.ApiService
import com.lesniak.network.di.NetworkModule
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class ApiModule {

    @Provides
    @Singleton
    fun apiService(retrofit: Retrofit) =
        retrofit.create(ApiService::class.java)
}