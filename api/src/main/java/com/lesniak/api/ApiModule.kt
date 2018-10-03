package com.lesniak.api

import com.lesniak.api.services.ApiService
import com.lesniak.api.services.ServicesModule
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [ServicesModule::class])
class ApiModule {

    @Provides
    @Singleton
    fun apiService(retrofit: Retrofit) =
        retrofit.create(ApiService::class.java)
}