package com.lesniak.api.services

import com.lesniak.api.network.NetworkModule
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class ServicesModule {

    @Provides
    @Singleton
    fun apiService(retrofit: Retrofit) =
        retrofit.create(ApiService::class.java)
}